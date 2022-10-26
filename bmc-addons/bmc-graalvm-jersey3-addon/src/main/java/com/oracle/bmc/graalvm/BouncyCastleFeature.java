/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.graalvm.nativeimage.ImageSingletons;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeClassInitialization;
import org.graalvm.nativeimage.impl.RuntimeClassInitializationSupport;

import java.security.Security;

/** Configures bouncy castle. */
@AutomaticFeature
final class BouncyCastleFeature implements Feature {

    @Override
    public void afterRegistration(AfterRegistrationAccess access) {
        RuntimeClassInitialization.initializeAtBuildTime("org.bouncycastle");
        RuntimeClassInitializationSupport classInitSupport =
                ImageSingletons.lookup(RuntimeClassInitializationSupport.class);
        classInitSupport.rerunInitialization(
                "org.bouncycastle.jcajce.provider.drbg.DRBG$Default",
                "Register the BouncyCastle provider at build time");
        classInitSupport.rerunInitialization(
                "org.bouncycastle.jcajce.provider.drbg.DRBG$NonceAndIV",
                "Register the BouncyCastle provider at build time");
        Security.addProvider(new BouncyCastleProvider());
    }
}
