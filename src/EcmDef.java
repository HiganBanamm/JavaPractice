/*要求：
 * 编写应用程序ECMDef.java,接受命令行的两个参数，要求不能输入负数，计算两数相除。
 * 对数据类型不一致（NumberFormatException）、
 * 缺少命令行参数（ArrayIndexOutOfBoundsException）
 * 以及输入负数（EcDef自定义的异常）进行异常处理
 
 * 提示：（1）在主类（EcmDef）中定义异常方法（ecm）完成两数相除功能
 * （2）在main()方法中使用异常处理语句进行异常处理
 * （3）在程序中，自定义对应输入负数的异常类（EcDef）
 * （4）运行时接受参数java EcmDef20 10 //args[0]="10" args[0]="20"
 * (5)Integer类的static方法parseInt(String s)将s转换成对应的int值
 *     如int a = Interger.parseInt("314"); //a=314;
 * 
 * */
public class EcmDef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 输入两个数
			// Integer类的static方法parseInt(String s)将s转换成对应的int值
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			ecm(i, j);
		} catch (NumberFormatException e) {
			System.out.println("数据类型不一致");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
		}catch (ArithmeticException e) {
			System.out.println("分母为0了");
		}catch (EcDef e) {
			System.out.println(e.getMessage());
		}

	}

	// 定义异常方法（ecm）完成两数相除功能
	public static void ecm(int i, int j) throws EcDef {
		if (i < 0 || j < 0) {
			throw new EcDef("您输入的数值存在负数");
		}
		System.out.println(i / j);

	}

	// TODO 自定义异常类，仿照Exception写就行
	static class EcDef extends Exception {
		static final long serialVersionUID = -42648392L;

		public EcDef() {

		}

		public EcDef(String smg) {
			// TODO Auto-generated constructor stub
			super(smg);
		}

	}

}
