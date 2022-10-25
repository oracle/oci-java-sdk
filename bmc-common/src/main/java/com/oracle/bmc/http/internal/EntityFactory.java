/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.io.InputStream;

import javax.annotation.Nullable;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Variant;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.oracle.bmc.util.internal.ReflectionUtils;

/**
 * Factory to create Entity instances for POST/PUT/PATCH requests.
 * Takes care of determining the correct type of entity to create.
 */
public class EntityFactory {

    /**
     * Create an entity for PATCH requests.
     * @param request The original Request object sent to the service client.
     * @param body The actual body being sent.
     * @return The entity, or null if no body given.
     */
    Entity<?> forPatch(Object request, Object body) {
        // null bodies allowed
        if (body == null) {
            return null;
        }
        // POST only supports JSON bodies
        return Entity.json(getBodyAsString(body));
    }

    /**
     * Create an entity for POST requests.
     * @param request The original Request object sent to the service client.
     * @param body The actual body being sent.
     * @return The entity, or null if no body given.
     */
    Entity<?> forPost(Object request, Object body) {
        // null bodies allowed
        if (body == null) {
            return null;
        }

        Entity<?> requestBody = null;
        // only json payloads or raw input streams allowed.
        // in the latter case, allow caller to be able to specify content-type
        // by inspecting the request for common 'getContent*' methods.
        // NOTE: this is necessary because using an Entity to put data will overwrite
        // any content-* headers already set on the Invocation.Builder request, and there
        // doesn't seem to be a way to set the entity content (payload) without attempting
        // to overwrite/set the content-* headers.
        // You also cannot set the variant to null (to try to preserve any existing headers)
        // as that will remove them altogether or set them explicitly to null.
        if (body instanceof InputStream) {
            requestBody = Entity.entity(body, InputStreamVariantCreator.create(request));
        } else {
            requestBody = Entity.json(getBodyAsString(body));
        }
        return requestBody;
    }

    /**
     * Create an entity for PUT requests.
     * @param request The original Request object sent to the service client.
     * @param body The actual body being sent.
     * @return The entity, or null if no body given.
     */
    Entity<?> forPut(Object request, Object body) {
        // null bodies allowed
        if (body == null) {
            return null;
        }

        Entity<?> requestBody = null;
        // only json payloads or raw input streams allowed.
        // in the latter case, allow caller to be able to specify content-type
        // by inspecting the request for common 'getContent*' methods.
        // NOTE: this is necessary because using an Entity to put data will overwrite
        // any content-* headers already set on the Invocation.Builder request, and there
        // doesn't seem to be a way to set the entity content (payload) without attempting
        // to overwrite/set the content-* headers.
        // You also cannot set the variant to null (to try to preserve any existing headers)
        // as that will remove them altogether or set them explicitly to null.
        if (body instanceof InputStream) {
            requestBody = Entity.entity(body, InputStreamVariantCreator.create(request));
        } else {
            requestBody = Entity.json(getBodyAsString(body));
        }
        return requestBody;
    }

    /**
     * Need to preserve the content headers that get overridden by the Variant provided
     * by the Entity. See {@link org.glassfish.jersey.client.ClientRequest#variant(javax.ws.rs.core.Variant)}.
     * <p>
     * NOTE: this should ideally only be inspecting the headers (in case there were query
     * params with the same names, for example), but we don't have access to just the headers
     * right now.
     */
    private static final class InputStreamVariantCreator {
        // using normal auto-generated method getter names, extract the header values
        // that would have been set already
        private static Variant create(Object request) {
            // default to octet-stream for input streams
            String contentType =
                    getValue(request, "getContentType", MediaType.APPLICATION_OCTET_STREAM);
            // no default content language
            String contentLanguage = getValue(request, "getContentLanguage", null);
            // no default content encoding
            String contentEncoding = getValue(request, "getContentEncoding", null);

            return new Variant(MediaType.valueOf(contentType), contentLanguage, contentEncoding);
        }

        private static String getValue(Object request, String methodName, String defaultValue) {
            Object response = ReflectionUtils.invokeGetter(request, methodName);
            if (response != null && response instanceof String) {
                return (String) response;
            }
            return defaultValue;
        }
    }

    /**
     * Convert the body to a JSON string, unless it is already a string.
     * @param body body
     * @return body as string
     */
    static String getBodyAsString(@Nullable Object body) {
        try {
            return (body instanceof String)
                    ? (String) body
                    : com.oracle.bmc.http.Serialization.getObjectMapper().writeValueAsString(body);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Unable to process JSON body", e);
        }
    }
}
