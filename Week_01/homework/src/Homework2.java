import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @description 
 *
 * @author renxin
 * @email renxinzhiliangzhi@163.com
 * @date 2020/11/15 4:07 下午
 */
public class Homework2 extends ClassLoader{


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> hello = new Homework2().loadClass("Hello");

        Object instance = hello.newInstance();
        Method helloMethod = hello.getMethod("hello");
        helloMethod.invoke(instance);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        try(FileInputStream inputStream = new FileInputStream("/Users/renxin/github/JAVA-000/Week_01/homework/src/Hello.xlass")){
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            for(int index = 0 ; index < bytes.length ; index++){

                bytes[index] = (byte)(255 - bytes[index]);
            }
            return defineClass(name,bytes,0,bytes.length);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
