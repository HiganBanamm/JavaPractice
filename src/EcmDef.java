/*Ҫ��
 * ��дӦ�ó���ECMDef.java,���������е�����������Ҫ�������븺�����������������
 * ���������Ͳ�һ�£�NumberFormatException����
 * ȱ�������в�����ArrayIndexOutOfBoundsException��
 * �Լ����븺����EcDef�Զ�����쳣�������쳣����
 
 * ��ʾ����1�������ࣨEcmDef���ж����쳣������ecm����������������
 * ��2����main()������ʹ���쳣�����������쳣����
 * ��3���ڳ����У��Զ����Ӧ���븺�����쳣�ࣨEcDef��
 * ��4������ʱ���ܲ���java EcmDef20 10 //args[0]="10" args[0]="20"
 * (5)Integer���static����parseInt(String s)��sת���ɶ�Ӧ��intֵ
 *     ��int a = Interger.parseInt("314"); //a=314;
 * 
 * */
public class EcmDef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// ����������
			// Integer���static����parseInt(String s)��sת���ɶ�Ӧ��intֵ
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			ecm(i, j);
		} catch (NumberFormatException e) {
			System.out.println("�������Ͳ�һ��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ȱ�������в���");
		}catch (ArithmeticException e) {
			System.out.println("��ĸΪ0��");
		}catch (EcDef e) {
			System.out.println(e.getMessage());
		}

	}

	// �����쳣������ecm����������������
	public static void ecm(int i, int j) throws EcDef {
		if (i < 0 || j < 0) {
			throw new EcDef("���������ֵ���ڸ���");
		}
		System.out.println(i / j);

	}

	// TODO �Զ����쳣�࣬����Exceptionд����
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
