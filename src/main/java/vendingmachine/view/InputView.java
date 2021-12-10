package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.utils.ValidateUtils;

public class InputView {

	public static int inputVendingMachineCoin() {
		String coin = Console.readLine();
		ValidateUtils.validateInputCoin(coin);
		return Integer.parseInt(coin);
	}
}