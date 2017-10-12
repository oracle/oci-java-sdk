/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.*;
import java.util.Locale;

public abstract class ForwardingInvocationBuilder implements Invocation.Builder {

    public abstract Invocation.Builder delegate();

    @Override
    public Invocation build(String method) {
        return delegate().build(method);
    }

    @Override
    public Invocation build(String method, Entity<?> entity) {
        return delegate().build(method, entity);
    }

    @Override
    public Invocation buildGet() {
        return delegate().buildGet();
    }

    @Override
    public Invocation buildDelete() {
        return delegate().buildDelete();
    }

    @Override
    public Invocation buildPost(Entity<?> entity) {
        return delegate().buildPost(entity);
    }

    @Override
    public Invocation buildPut(Entity<?> entity) {
        return delegate().buildPut(entity);
    }

    @Override
    public AsyncInvoker async() {
        return delegate().async();
    }

    @Override
    public ForwardingInvocationBuilder accept(String... mediaTypes) {
        delegate().accept(mediaTypes);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder accept(MediaType... mediaTypes) {
        delegate().accept(mediaTypes);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder acceptLanguage(Locale... locales) {
        delegate().acceptLanguage(locales);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder acceptLanguage(String... locales) {
        delegate().acceptLanguage(locales);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder acceptEncoding(String... encodings) {
        delegate().acceptEncoding(encodings);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder cookie(Cookie cookie) {
        delegate().cookie(cookie);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder cookie(String name, String value) {
        delegate().cookie(name, value);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder cacheControl(CacheControl cacheControl) {
        delegate().cacheControl(cacheControl);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder header(String name, Object value) {
        delegate().header(name, value);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder headers(MultivaluedMap<String, Object> headers) {
        delegate().headers(headers);
        return this;
    }

    @Override
    public ForwardingInvocationBuilder property(String name, Object value) {
        delegate().property(name, value);
        return this;
    }

    @Override
    public Response get() {
        return delegate().get();
    }

    @Override
    public <T> T get(Class<T> responseType) {
        return delegate().get(responseType);
    }

    @Override
    public <T> T get(GenericType<T> responseType) {
        return delegate().get(responseType);
    }

    @Override
    public Response put(Entity<?> entity) {
        return delegate().put(entity);
    }

    @Override
    public <T> T put(Entity<?> entity, Class<T> responseType) {
        return delegate().put(entity, responseType);
    }

    @Override
    public <T> T put(Entity<?> entity, GenericType<T> responseType) {
        return delegate().put(entity, responseType);
    }

    @Override
    public Response post(Entity<?> entity) {
        return delegate().post(entity);
    }

    @Override
    public <T> T post(Entity<?> entity, Class<T> responseType) {
        return delegate().post(entity, responseType);
    }

    @Override
    public <T> T post(Entity<?> entity, GenericType<T> responseType) {
        return delegate().post(entity, responseType);
    }

    @Override
    public Response delete() {
        return delegate().delete();
    }

    @Override
    public <T> T delete(Class<T> responseType) {
        return delegate().delete(responseType);
    }

    @Override
    public <T> T delete(GenericType<T> responseType) {
        return delegate().delete(responseType);
    }

    @Override
    public Response head() {
        return delegate().head();
    }

    @Override
    public Response options() {
        return delegate().options();
    }

    @Override
    public <T> T options(Class<T> responseType) {
        return delegate().options(responseType);
    }

    @Override
    public <T> T options(GenericType<T> responseType) {
        return delegate().options(responseType);
    }

    @Override
    public Response trace() {
        return delegate().trace();
    }

    @Override
    public <T> T trace(Class<T> responseType) {
        return delegate().trace(responseType);
    }

    @Override
    public <T> T trace(GenericType<T> responseType) {
        return delegate().trace(responseType);
    }

    @Override
    public Response method(String name) {
        return delegate().method(name);
    }

    @Override
    public <T> T method(String name, Class<T> responseType) {
        return delegate().method(name, responseType);
    }

    @Override
    public <T> T method(String name, GenericType<T> responseType) {
        return delegate().method(name, responseType);
    }

    @Override
    public Response method(String name, Entity<?> entity) {
        return delegate().method(name, entity);
    }

    @Override
    public <T> T method(String name, Entity<?> entity, Class<T> responseType) {
        return delegate().method(name, entity, responseType);
    }

    @Override
    public <T> T method(String name, Entity<?> entity, GenericType<T> responseType) {
        return delegate().method(name, entity, responseType);
    }
}
