/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;

/** See {@link NoMixedOciJavaSdkVersionsRule#execute()}. */
public class NoMixedOciJavaSdkVersionsException extends EnforcerRuleException {
    private final Map<String, Set<Artifact>> versions;

    public NoMixedOciJavaSdkVersionsException(String message, Map<String, Set<Artifact>> versions) {
        super(message);
        this.versions = Collections.unmodifiableMap(versions);
    }

    public Map<String, Set<Artifact>> getVersionsInConflict() {
        return versions;
    }
}
