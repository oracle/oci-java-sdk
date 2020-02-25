/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import java.util.Map;
import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.spi.LoginModule;

abstract class OciLoginModule implements LoginModule {

    private static final String INTENT_CONFIG = "intent";

    static {
        OciSaslClientProvider.initialize();
    }

    @Override
    public void initialize(
            Subject subject,
            CallbackHandler callbackHandler,
            Map<String, ?> sharedState,
            Map<String, ?> options) {

        final String intent = (String) options.get(INTENT_CONFIG);
        if (intent == null) {
            throw new IllegalArgumentException("Intent is required.");
        }

        // The intent is considered a public credential (use NameCallback to retrieve)
        subject.getPublicCredentials().add(intent);

        final BasicAuthenticationDetailsProvider authProvider = loadAuthenticationProvider(options);

        // Because Kafka doesn't allow using a custom callback handler and requires the password to be a string
        // we will map the auth provider to a UUID and use the cache key as a private credential.
        // The SASL client will retrieve the auth provider using the key.
        final String cacheKey = OciSaslClient.AuthProviderCache.cache(authProvider);
        subject.getPrivateCredentials().add(cacheKey);
        // We will also add it as the full instance for newer SASL clients that can control their callback handler.
        // The callback handler will need to handle callback of type OciAuthProviderCallback.
        subject.getPrivateCredentials().add(authProvider);
    }

    protected abstract BasicAuthenticationDetailsProvider loadAuthenticationProvider(
            Map<String, ?> options);

    @Override
    public boolean login() {
        return true;
    }

    @Override
    public boolean commit() {
        return true;
    }

    @Override
    public boolean abort() {
        return false;
    }

    @Override
    public boolean logout() {
        return true;
    }
}
