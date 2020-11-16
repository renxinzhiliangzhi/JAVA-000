/**
 *
 * @description 自己写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，if 和 for，然后自己分析一下对应的字节码，有问题群里讨论
 *  <P>1. javac Homework1.java 编译class文件</P>
 *  <p>2. javap -c Homework1 查看字节码文件指令</p>
 *
 * @author renxin
 * @email renxinzhiliangzhi@163.com
 * @date 2020/11/15 3:25 下午
 */
public class Homework1 {


    public static void main(String[] args) {

        int varInt = 1;
        int varInt2 = 3;
        boolean varBoolean = true;
        boolean varBoolean2 = false;
        short varShort = 2;
        byte varBye = 4;
        char varChar = 'a';
        long varLong = 10;
        double varDouble = 10.9;
        float varFloat = 9.01f;
        
        if(varInt < varInt2){
            System.out.println(varInt);
        }
        
        int result = varInt2 / varInt;
        double doubleResult = varInt + varDouble;
        long longResult = varLong - varShort;
        float floatResult = varFloat * varBye;

        for(;result>0;result--){
            System.out.println(result);
        }

        System.out.println(varChar/1);

        
    }
    
    
    
}
