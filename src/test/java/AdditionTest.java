import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdditionTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			// Original
			// LOG.info("Testing the method add small with: " + firstNumber + " and " +
			// secondNumber);
			// assertEquals(Math.round(calculator.add(firstNumber, secondNumber)),
			// Math.round(result), 1);

			// testing other way:
			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add small positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". The temp is " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			// not in the assignment. All following methods will include this for
			// clarification. See above method for original.
			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add medium positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add large positive with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		// for (int i = 0; i < 5; i++) {
		// firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
		// secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
		// result = firstNumber + secondNumber;

		double resultMethod = calculator.add(firstNumber, secondNumber);

		LOG.info("Testing the method add zeros with: " + firstNumber + " and " + secondNumber + " . Result of those: "
				+ result + ". Result from Method is: " + resultMethod);
		assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		// }
	}

	@Test
	public void testAddFirstZero() {

		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {
			// tycker det �r relevant att slumpa fram parametern som inte �r zero
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			double result = firstNumber + secondNumber;

			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add first zero with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}

	}

	@Test
	public void testAddSecondZero() {
		double firstNumber = 0;
		double secondNumber = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			double result = firstNumber + secondNumber;

			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add second zero with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);
		}

	}

	// Question: Why is some results ex: -14.908999999999? We perform a round, and
	// it works other times the loop prints..?
	@Test
	public void testAddSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			result = firstNumber + secondNumber;

			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add small negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". The temp is " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			result = firstNumber + secondNumber;

			// not in the assignment. All following methods will include this for
			// clarification. See above method for original.
			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add medium negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			result = firstNumber + secondNumber;

			double resultMethod = calculator.add(firstNumber, secondNumber);

			LOG.info("Testing the method add large negative with: " + firstNumber + " and " + secondNumber
					+ " . Result of those: " + result + ". Result from Method is: " + resultMethod);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
}
