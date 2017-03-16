package mine.ticks.common.file;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class FileNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("fileAccessor", new FileAccessorBeanDefinitionParser());
    }
}
