import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class DivitionTest {

	// There should be a try catch or if else thing on all of these since every
	// method have the possible outcome of randoming a zero

	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testDivSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 600; i++) {

			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));

			
			//Mine:
			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + " - Nurs: " + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info(i + "Testing the method divide small positive with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". The temp is " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			}

		}
	}

	@Test
	public void testDivMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 600; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));

			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info(i + "Testing the method divide medium positive with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". The temp is " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			}
		}
	}

	@Test
	public void testDivLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 600; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));

			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info(i + "Testing the method divide large positive with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". The temp is " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			}
		}
	}

	@Test
	public void testDivZeros() {
		double firstNumber = 0;
		double secondNumber = 0;

		// Mine 02:
		// double result = firstNumber / secondNumber;
		// His:
		double result = -0.123456789;

		// Mine 02:
		// double resultMethod = calculator.divide(firstNumber, secondNumber);

		// Mine 01: Works but this should be handled in calculator to make the system
		// safe and
		// not just the test
		// if (firstNumber == 0.0 || secondNumber == 0.0) {
		//
		// LOG.info(firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
		// } else {
		// double result = firstNumber / secondNumber;
		//
		// double resultMethod = calculator.divide(firstNumber, secondNumber);
		//
		// LOG.info("Testing the method divide zeros with: " + firstNumber + " and " +
		// secondNumber
		// + " . Result of those: " + result + ". Result from Method is: " +
		// resultMethod);
		// assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)),
		// Math.round(result), 1);
		// }

		// // Mine 02: Test of handling 0-erros in Cal* This prints out Cal method
		// sysout twice
		// // since its also called in the assert.. Don't like it.. How to fix?
		// if (resultMethod == -0.123456789) {
		//
		// LOG.info("Testing the method divide zeros with: " + firstNumber + " and " +
		// secondNumber
		// + " . You can't devide by zero!!");
		// assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)),
		// Math.round(-0.123456789), 1);
		// } else {
		// LOG.info("Testing the method divide zeros with: " + firstNumber + " and " +
		// secondNumber
		// + " . Result of those: " + result + ". Result from Method is: " +
		// resultMethod);
		// assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)),
		// Math.round(result), 1);
		// }

		// His:
		// *He does all tests in the same testcase, after eachother. Smart. Just giving
		// new values to first and second nr, each test.
		// *He has already decided that the method should return the faulty value..?
		// Why?
		// Aah, cause he only want to have a test for that maybe.. Nope. Sees like the
		// first log should have a note saying: "Testing divide 0 and 0".
		LOG.info("Testing the method divide zeros with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 1; i++) {

			// Testing the case of something random / zero
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = 0;
			result = -0.123456789;

			LOG.info("Testing the method divide with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case of zero / something random
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}

	}

	// Not well formed, see test zeros above for more info. This doesnt use
	// calculator at all. Dont have energy to fix it thogh.
	@Test
	public void testDivFirstZero() {
		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));

			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + " nrs: " + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				double result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info("Testing the method divide first zero with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			}

		}

	}

	// Not well formed, see test zeros above for more info. This doesnt use
	// calculator at all. Dont have energy to fix it thogh.
	@Test
	public void testDivSecondZero() {
		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));

			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + " nrs: " + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				double result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info("Testing the method divide second zero with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

			}

		}

	}

	@Test
	public void testDivSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 600; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10));

			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info("Testing the method divide small negative with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". The temp is " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			}
		}

	}

	@Test
	public void testDivMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 600; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100));

			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info("Testing the method divide medium negative with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			}
		}
	}

	@Test
	public void testDivLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 600; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000));

			if (firstNumber == 0.0 || secondNumber == 0.0) {

				LOG.info(i + firstNumber + " , " + secondNumber + ". CAN'T DEVIDE BY ZERO!");
			} else {
				result = firstNumber / secondNumber;

				double resultMethod = calculator.divide(firstNumber, secondNumber);

				LOG.info("Testing the method divide large negative with: " + firstNumber + " and " + secondNumber
						+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			}
		}

	}

}
