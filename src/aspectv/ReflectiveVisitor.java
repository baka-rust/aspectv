package aspectv;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ast.AbstractNode;

abstract public class ReflectiveVisitor {

	private static Class<? extends Object> objectClass = (new Object()).getClass();
	
	public void defaultVisit(Object o) {
		visitChildren((AbstractNode)o);
	}
	
	public void visitChildren(AbstractNode n) {
		if (n.firstChild != null) {
			AbstractNode currentNode = n.firstChild;
			currentNode.accept(this);
			while (currentNode.nextSibling != null) {
				currentNode = currentNode.nextSibling;
				currentNode.accept(this);
			}
		}
	}
	
	// via http://www.cs.wustl.edu/~cytron/cacweb/Tutorial/Visitor/
	public final void dispatch(Object o) {
		Method m = getBestMethodFor(o);
		try {
			m.invoke(this, new Object[] { o });
		} catch (IllegalAccessException e) {
			e.printStackTrace(System.err);
			throw new Error("Method " + m + " aborting, bad access: " + e);
		} catch (InvocationTargetException e) {
			if (e.getCause() != null) {
				throw new Error(e.getCause());
			} else {
				e.printStackTrace(System.err);
				throw new Error("Method " + m + " aborting: " + e + " cause: " + e.getCause());
			}
		}
	}
	
	protected Method getBestMethodFor(Object o) {
		Class<? extends Object> nodeClass = o.getClass();
		Method ans = null;
		
		// try superclasses
		for (Class<? extends Object> c = nodeClass; c != objectClass && ans == null; c = c.getSuperclass()) {
			try {
				ans = getClass().getMethod("visit", new Class[] {c});
			} catch (NoSuchMethodException e) {}
		}
		
		// try interfaces & all superclasses interfaces
		Class<? extends Object> iClass = nodeClass;
		while (ans == null && iClass != objectClass) {
			Class<? extends Object>[] interfaces = iClass.getInterfaces();
			for (int i = 0; i < interfaces.length; i++) {
				try {
					ans = getClass().getMethod("visit", new Class[] {interfaces[i]});
				} catch (NoSuchMethodException e) {}
				
				Class<? extends Object>[] superInterfaces = interfaces[i].getInterfaces();
				for (int j = 0; j < superInterfaces.length && ans == null; j++) {
					try {
						ans = getClass().getMethod("visit", new Class[] {superInterfaces[j]});
					} catch (NoSuchMethodException e) {}
				}
			}
			iClass = iClass.getSuperclass();
		}
		
		if (ans == null) {
			try { 
				ans = getClass().getMethod("defaultVisit", new Class[] {(new Object()).getClass()});
			} catch (NoSuchMethodException e) {
				e.printStackTrace(System.err);
				System.exit(-1);
			}
		}
		
		return ans;
	}
	
}
