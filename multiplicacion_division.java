public float multiplicacion(float num1, float num2){
	return num1 * num2;
}
public float division(float num1, float num2){
	if(num2==0){
		if(num1==0)
			return "Error";
		else
		return "Infinity";
	}
	else
		return num1 / num2;
}

