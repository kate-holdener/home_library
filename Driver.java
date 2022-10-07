import java.util.*;
public class Driver {
    public static void main(String[] args) {

double []coefficients = {1};
int []exponents = {2};

	  DensePolynomial sp01 = new DensePolynomial(coefficients, exponents);
double []coefficient = {5};
int []exponent = {3};
        DensePolynomial sp02 = new DensePolynomial(coefficient, exponent);
	System.out.println(sp01.eval(2));
        System.out.println(sp01.getCoefficient(2));
        System.out.println(sp01.getMaxDegree());
double []coefficient3 = {1};
int []exponent3 = {2};
        SparsePolynomial sp1 = new SparsePolynomial(coefficient3, exponent3);
double []coefficient4 = {5};
int []exponent4 = {3};
        SparsePolynomial sp2 = new SparsePolynomial(coefficient4, exponent4);
	System.out.println(sp01.eval(2));
        System.out.println(sp1.getCoefficient(2));
        System.out.println(sp1.getMaxDegree());
int k=sp01.getMaxDegree();
if (!testMaxDegree(k, 2))
{
System.out.println("Error in maxDegree of DensePolynomial");
}
else
{
System.out.println("No Error in maxDegree of DensePolynomial");
}

int l=sp1.getMaxDegree();
if (!testMaxDegree(l, 2))
{
System.out.println("Error in maxDegree of SparsePolynomial");
}
else
{
System.out.println("No Error in maxDegree of SparsePolynomial");
}
if (!testCoefficient(l, 2))
{
System.out.println("Error in Coefficient of SparsePolynomial");
}
else
{
System.out.println("No Error in Coefficient of SparsePolynomial");
}
if (!testeval(l, 2,3))
{
System.out.println("Error in eval of SparsePolynomial");
}
else
{
System.out.println("No Error in eval of SparsePolynomial");
}

  }
public static boolean testMaxDegree(int p1, int expectedValue_dense)
{
if (p1==expectedValue_dense)
	return true;
else
	return false;
}
public static boolean testCoefficient(int p1, int expectedValue_coefficient)
{
if (p1==expectedValue_coefficient)
	return true;
else
	return false;
}
public static boolean testeval(int p1,  double x, double expectedValue)
{
if (p1==expectedValue)
	return true;
else
	return false;
}
}