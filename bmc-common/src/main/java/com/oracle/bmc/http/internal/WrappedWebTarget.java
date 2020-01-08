/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import lombok.AllArgsConstructor;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Map;

/**
 * A {@link WebTarget} that delegates to another {@link WebTarget}, but creates {@link WrappedInvocationBuilder}
 * instances instead of plain {@link javax.ws.rs.client.Invocation.Builder} instances.
 */
@AllArgsConstructor
public class WrappedWebTarget implements WebTarget {
    private final WebTarget delegate;

    @Override
    public URI getUri() {
        return delegate.getUri();
    }

    @Override
    public UriBuilder getUriBuilder() {
        return delegate.getUriBuilder();
    }

    @Override
    public WrappedWebTarget path(String path) {
        return new WrappedWebTarget(delegate.path(path));
    }

    @Override
    public WrappedWebTarget resolveTemplate(String name, Object value) {
        return new WrappedWebTarget(delegate.resolveTemplate(name, value));
    }

    @Override
    public WrappedWebTarget resolveTemplate(String name, Object value, boolean encodeSlashInPath) {
        return new WrappedWebTarget(delegate.resolveTemplate(name, value, encodeSlashInPath));
    }

    @Override
    public WrappedWebTarget resolveTemplateFromEncoded(String name, Object value) {
        return new WrappedWebTarget(delegate.resolveTemplateFromEncoded(name, value));
    }

    @Override
    public WrappedWebTarget resolveTemplates(Map<String, Object> templateValues) {
        return new WrappedWebTarget(delegate.resolveTemplates(templateValues));
    }

    @Override
    public WrappedWebTarget resolveTemplates(
            Map<String, Object> templateValues, boolean encodeSlashInPath) {
        return new WrappedWebTarget(delegate.resolveTemplates(templateValues, encodeSlashInPath));
    }

    @Override
    public WrappedWebTarget resolveTemplatesFromEncoded(Map<String, Object> templateValues) {
        return new WrappedWebTarget(delegate.resolveTemplatesFromEncoded(templateValues));
    }

    @Override
    public WrappedWebTarget matrixParam(String name, Object... values) {
        return new WrappedWebTarget(delegate.matrixParam(name, values));
    }

    @Override
    public WrappedWebTarget queryParam(String name, Object... values) {
        return new WrappedWebTarget(delegate.queryParam(name, values));
    }

    @Override
    public WrappedInvocationBuilder request() {
        return new WrappedInvocationBuilder(delegate.request());
    }

    @Override
    public WrappedInvocationBuilder request(String... acceptedResponseTypes) {
        return new WrappedInvocationBuilder(delegate.request(acceptedResponseTypes));
    }

    @Override
    public WrappedInvocationBuilder request(MediaType... acceptedResponseTypes) {
        return new WrappedInvocationBuilder(delegate.request(acceptedResponseTypes));
    }

    @Override
    public Configuration getConfiguration() {
        return delegate.getConfiguration();
    }

    @Override
    public WrappedWebTarget property(String name, Object value) {
        return new WrappedWebTarget(delegate.property(name, value));
    }

    @Override
    public WrappedWebTarget register(Class<?> componentClass) {
        return new WrappedWebTarget(delegate.register(componentClass));
    }

    @Override
    public WrappedWebTarget register(Class<?> componentClass, int priority) {
        return new WrappedWebTarget(delegate.register(componentClass, priority));
    }

    @Override
    public WrappedWebTarget register(Class<?> componentClass, Class<?>... contracts) {
        return new WrappedWebTarget(delegate.register(componentClass, contracts));
    }

    @Override
    public WrappedWebTarget register(Class<?> componentClass, Map<Class<?>, Integer> contracts) {
        return new WrappedWebTarget(delegate.register(componentClass, contracts));
    }

    @Override
    public WrappedWebTarget register(Object component) {
        return new WrappedWebTarget(delegate.register(component));
    }

    @Override
    public WrappedWebTarget register(Object component, int priority) {
        return new WrappedWebTarget(delegate.register(component, priority));
    }

    @Override
    public WrappedWebTarget register(Object component, Class<?>... contracts) {
        return new WrappedWebTarget(delegate.register(component, contracts));
    }

    @Override
    public WrappedWebTarget register(Object component, Map<Class<?>, Integer> contracts) {
        return new WrappedWebTarget(delegate.register(component, contracts));
    }
}
