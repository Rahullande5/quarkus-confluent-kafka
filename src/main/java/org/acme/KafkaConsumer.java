package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.XmlUnmarshaller;

@ApplicationScoped
public class XmlUnmarshallerFactory {

    public <T> XmlUnmarshaller<T> create(Class<T> clazz) {
        return new XmlUnmarshaller<>(clazz);
    }
}