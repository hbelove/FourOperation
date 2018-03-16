package fraction;

public class Fractions {
    private int numerator;  //����
    private int denominator;  //��ĸ
 
    public Fractions(){
    }
    //����������
    public Fractions(int numerator,int denominator){
    	this.setValue(numerator, denominator);
    }
    // ���÷��ӷ�ĸ
    public void setValue(int numerator,int denominator)
    {
    	if(numerator==0){
    		this.numerator=0;
    		this.denominator=1;
    		return;
    	}
    	if(denominator==0){
    		System.out.println("Error:denominator equals zero!");
    	}
        int temp=maxCommonDivisor(denominator, numerator);  //tempΪ���Լ��
        this.numerator=numerator/temp;
        this.denominator=denominator/temp;
    }
    // �����Լ��
    public static int maxCommonDivisor(int d, int n) 
    {  
        if (d < n) {// ��֤d>n,��d<n,��������ݽ���  
            int temp = d;  
            d = n;  
            n = temp;  
        }  
        while (d % n != 0) {// ����������Ϊ0ʱ,����ѭ��  
            int temp = d % n;  
            d = n;  
            n = temp;  
        }  
        return n;// �������Լ��  
    }
    // ����С������
    public static int minCommonMultiple(int m, int n) {  
        return m * n / maxCommonDivisor(m, n);  
    }  
    // ��ӡ����
    public String printFraction()
    {
        return (this.numerator+"/"+this.denominator).toString();
    }
    // ��ȡ����
    public int getNumerator()
    {
        return this.numerator;
    }
    // ��ȡ��ĸ
    public int getDenominator()
    {
        return this.denominator;
    }
    //�ж��Ƿ����ת��Ϊ����
    private boolean isInteger(){
    	if(this.denominator==1||this.denominator==-1)
    		return true;
    	else return false;
    }
    //ת��Ϊ����
    public int changeToInteger(){
    	if(this.isInteger())
    		return this.getNumerator();
    	else 
    		return Integer.MAX_VALUE;
    }
}