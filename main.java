/*funcion factorial 201314882*/
public int factorial (double numero) {
  if (numero==0)
	  return 1;
  else
	  return numero * factorial(numero-1);
}

