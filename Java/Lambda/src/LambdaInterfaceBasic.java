import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaInterfaceBasic {
	public void run() {
		// 1. Supplier : �Է°��� �ְ�, ��ȯ���� ������ ���
		Supplier<Integer> supplier = () -> 180+20;
		System.out.println(supplier.get());
		
		// 2. Consumer : �Է°��� �ְ�, ��ȯ���� ������ ���
		//				 �ڵ� ������ ���ó���� �Ǿ�� �Ѵ�.
		Consumer<Integer> consumer = System.out::println;
		consumer.accept(100);
		// 3. Function : �Է°��� �ְ�, ��ȯ���� �ִ�.
		Function<Integer, Double> function = x -> x * 0.55;
		System.out.println(function.apply(50));
		// 4. Predicate : �Է°��� ���� �� ������ �Ǵ�. return type = boolean
		Predicate<Integer> predicate = x -> x < 100;
		System.out.println("50�� 100���� �۽��ϴ� : " + predicate.test(50));
		// 5. �Է°� ��ȯ Ÿ���� ������ �� ���
		UnaryOperator<Integer> unary = x -> x + 20;
		System.out.println(unary.apply(100));
		
		// ���� �������̽�
		
		// 1. BiConsumer : Consumer�� �Է°��� �ΰ�
		BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println(x + y);
		biConsumer.accept(30, 27);
		
		// 2. BiFunction : Function�� �Է°��� �ΰ�
		// 3. BiPredicate : Predicate�� �Է°��� �ΰ�
		// 4. BinaryOperator : Operator�� �Է°��� �ΰ�
	}
}