/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.oracle.bmc.SdkClients;
import com.oracle.bmc.graalvm.utils.ReflectionUtils;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import org.glassfish.hk2.utilities.DescriptorImpl;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;
import org.jvnet.hk2.internal.SystemDescriptor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

final class SdkAutomaticFeature implements Feature {
    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        // setup BC security
        Set<Class<?>> reflectiveAccess = new HashSet<>();
        populateReflectionData(reflectiveAccess, ResponseHelper.ErrorCodeAndMessage.class);
        String[] classes = resolveOracleCloudSdkClientNames(access).toArray(new String[0]);
        for (String aClass : classes) {
            Class<?> c = access.findClassByName(aClass);
            if (c != null) {
                Set<Class> allInterfaces = ReflectionUtils.getAllInterfaces(c);
                for (Class i : allInterfaces) {
                    if (i.getName().endsWith("Async")) {
                        continue;
                    }
                    populateReflectionData(reflectiveAccess, i);
                }
            }
        }

        for (Class<?> type : reflectiveAccess) {
            boolean hasNoArgsConstructor =
                    !type.isEnum()
                            && !type.isInterface()
                            && hasNoArgsConstructor(type.getDeclaredConstructors());

            RuntimeReflection.register(type);
            if (hasNoArgsConstructor) {
                RuntimeReflection.registerForReflectiveInstantiation(type);
            }
            for (Method declaredMethod : type.getDeclaredMethods()) {
                RuntimeReflection.register(declaredMethod);
            }
            if (!type.isInterface()) {
                for (Field declaredField : type.getDeclaredFields()) {
                    RuntimeReflection.register(declaredField);
                }
            }
        }
    }

    public static List<String> resolveOracleCloudSdkClientNames(BeforeAnalysisAccess access) {
        List<String> results = new ArrayList<>();
        SdkClientPackages allSdkClientPackages =
                SdkAutomaticFeatureMetadata.class.getAnnotation(SdkClientPackages.class);
        for (String sdkClientsMetadataPath : allSdkClientPackages.value()) {
            Class<?> sdkClientsMetadataClass = access.findClassByName(sdkClientsMetadataPath);
            if (sdkClientsMetadataClass != null) {
                Class<?>[] allSdkClients =
                        sdkClientsMetadataClass.getDeclaredAnnotation(SdkClients.class).value();
                for (Class sdkClient : allSdkClients) {
                    results.add(sdkClient.getName());
                }
            }
        }
        return results;
    }

    private boolean hasNoArgsConstructor(Constructor<?>[] declaredConstructors) {
        boolean hasNoArgsConstructor = false;
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            if (declaredConstructor.getParameterCount() == 0) {
                hasNoArgsConstructor = true;
                break;
            }
        }
        return hasNoArgsConstructor;
    }

    static void populateReflectionData(Set<Class<?>> reflectiveAccess, Class<?> type) {
        JsonDeserialize deser = type.getAnnotation(JsonDeserialize.class);
        if (deser != null) {
            Class<?> builder = deser.builder();
            if (builder != Void.class && includeInReflectiveData(reflectiveAccess, builder)) {
                reflectiveAccess.add(builder);
                populateReflectionData(reflectiveAccess, builder);
            }
        }
        final JsonTypeInfo ti = type.getAnnotation(JsonTypeInfo.class);
        if (ti != null) {
            final Class<?> di = ti.defaultImpl();
            if (di != type) {
                if (includeInReflectiveData(reflectiveAccess, di)) {
                    reflectiveAccess.add(di);
                    populateReflectionData(reflectiveAccess, di);
                }
            }
        }

        final JsonSubTypes subTypes = type.getAnnotation(JsonSubTypes.class);
        if (subTypes != null) {
            final JsonSubTypes.Type[] types = subTypes.value();
            if (types != null && types.length > 0) {
                for (JsonSubTypes.Type t : types) {
                    final Class<?> v = t.value();
                    if (includeInReflectiveData(reflectiveAccess, v)) {
                        reflectiveAccess.add(v);
                        populateReflectionData(reflectiveAccess, v);
                    }
                }
            }
        }
        Method[] methods = type.getDeclaredMethods();
        for (Method m : methods) {
            Class<?> rt = m.getReturnType();
            if (Collection.class.isAssignableFrom(rt)) {
                Type grt = m.getGenericReturnType();
                if (grt instanceof ParameterizedType) {
                    Type[] args = ((ParameterizedType) grt).getActualTypeArguments();
                    if (args != null && args.length == 1) {
                        Type arg = args[0];
                        if (arg instanceof Class
                                && includeInReflectiveData(reflectiveAccess, arg)) {
                            Class<?> t = (Class<?>) arg;
                            reflectiveAccess.add(t);
                            populateReflectionData(reflectiveAccess, t);
                        }
                    }
                }
            } else {
                if (includeInReflectiveData(reflectiveAccess, rt)) {
                    reflectiveAccess.add(rt);
                    populateReflectionData(reflectiveAccess, rt);
                }
            }
            Class<?>[] parameterTypes = m.getParameterTypes();
            for (Class<?> pt : parameterTypes) {
                if (includeInReflectiveData(reflectiveAccess, pt)) {
                    reflectiveAccess.add(pt);
                    populateReflectionData(reflectiveAccess, pt);
                }
            }
        }
    }

    static boolean includeInReflectiveData(Set<Class<?>> reflectiveAccess, Type rt) {
        return rt.getTypeName().startsWith("com.oracle.bmc") && !reflectiveAccess.contains(rt);
    }
}

// disable javassist proxies
@TargetClass(org.jvnet.hk2.internal.Utilities.class)
final class HK2UtilsReplacements {
    @Substitute
    public static synchronized boolean proxiesAvailable() {
        return false;
    }
}

@TargetClass(SystemDescriptor.class)
final class SystemDescriptorReplacements {
    @Substitute
    public Boolean isProxiable() {
        return false;
    }
}

@TargetClass(DescriptorImpl.class)
final class DescriptorImplReplacements {
    @Substitute
    public Boolean isProxiable() {
        return false;
    }
}

// replace ServiceFinder to not use custom classloader and javassist
@TargetClass(className = "org.glassfish.jersey.internal.ServiceFinder")
final class ServiceFinderReplacement<T> implements Iterable<T> {

    @Alias private Class<T> serviceClass;
    @Alias private String serviceName;
    @Alias private ClassLoader classLoader;
    @Alias private boolean ignoreOnClassNotFound;

    @Substitute
    private ServiceFinderReplacement(
            final Class<T> service, final ClassLoader loader, final boolean ignoreOnClassNotFound) {
        this(service, service.getName(), loader, ignoreOnClassNotFound);
    }

    @Substitute
    private ServiceFinderReplacement(
            final Class<T> service,
            final String serviceName,
            final ClassLoader loader,
            final boolean ignoreOnClassNotFound) {
        this.serviceClass = service;
        this.serviceName = serviceName;
        this.classLoader = loader;
        this.ignoreOnClassNotFound = ignoreOnClassNotFound;
    }

    @Override
    @Substitute
    public Iterator<T> iterator() {
        return ServiceLoader.load(serviceClass).iterator();
    }
}
