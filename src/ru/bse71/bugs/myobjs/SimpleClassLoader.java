package ru.bse71.bugs.myobjs;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) {
        File classFile = new File(name + ".class");
        try (
                BufferedInputStream bis = new BufferedInputStream(
                        new FileInputStream(classFile))
        ) {
            byte[] content = new byte[(int) classFile.length()];
            bis.read(content);
            return defineClass(name, content, 0, content.length);
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
            return null;
        }
    }
}
