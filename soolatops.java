public class soolatops{
	double a, b, c;
	public soolatops(double pikkus, double laius, double k6rgus){
		if(pikkus<=0){throw new RuntimeException("Vale pikkus");}
		if(k6rgus <=0){throw new RuntimeException("Vale kõrgus");}
		if(laius <=0){throw new RuntimeException("Vale laius");}
		a=pikkus;
		b=laius;
		c=k6rgus;
	}
	public double pindala(){
		return a*b;
	}
	//lisage funktsioon ristkyliku ruumala arvutamiseks
	public double ruumala(){
		return a*b*c;
	}
	public String toString(){
		return "soolatops "+a+" x "+b+" x "+c+" millimeetrit, ruumala "+
		       ruumala()+" kuupmillimeetrit, pindala "+pindala()+" ruutmillimeetrit.";
	}
}

/* soolatops 44.0 x 26.0 x 66.0 millimeetrit, ruumala 75504.0 kuupmillimeetrit, pindala 1144.0 ruutmillimeetrit.
soolatops 44.0 x 26.0 x 66.0 millimeetrit, ruumala 75504.0 kuupmillimeetrit, pindala 1144.0 ruutmillimeetrit.
*/