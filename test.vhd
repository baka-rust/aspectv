ARCHITECTURE behavioral OF regfile IS
   
BEGIN
   
   ra <= ir(26 DOWNTO 22) ;
   rb <= ir(21 DOWNTO 17) ;
   rc <= IR(16 DOWNTO 12) ;

   amux:PROCESS(ra,rb,rc,gra,grb,grc)
   BEGIN
      IF (gra = '1') THEN
	 mux_out <= ra ;
      ELSIF (grb = '1') THEN
         mux_out <= rb ;
      ELSIF (grc = '1') THEN
         mux_out <= rc ;
      ELSE
         mux_out <= "00000" ;
      END IF ;
   END PROCESS amux ; 
   
END behavioral ;