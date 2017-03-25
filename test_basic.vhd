library ieee;
use ieee.std_logic_1164.all;

entity OR_ent is
port(	x: in std_logic;
		y: in std_logic;
		F: out std_logic
);
end OR_ent;

architecture OR_arch of OR_ent is
begin
    process(x, y)
    begin
        -- compare to truth table
        if ((x='0') and (y='0')) then
        	F <= '0';
        elsif ((z='1')) then
        	F <= '1';
        else
        	F <= '1';
		end if;
    end process;

end OR_arch;