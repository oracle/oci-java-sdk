/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DefaultArtifact;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class NoMixedOciJavaSdkVersionsRuleTest {

    @Test
    public void ignoredDependencies() {
        List<String> allowedList = new ArrayList<>();
        allowedList.add("javax.servlet:javax.servlet-api:2.1.0");
        List<Artifact> artifacts =
                Stream.of(
                                "javax.inject:javax.inject:1",
                                "javax.crypto:javax.crypto:1",
                                "javax.servlet:javax.servlet-api:2.1.0",
                                "other.servlet:other.servlet:1")
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toArtifact)
                        .collect(Collectors.toList());
        List<String> ignored =
                NoMixedOciJavaSdkVersionsRule.ignoredDependencies(artifacts, allowedList).stream()
                        .map(NoMixedOciJavaSdkVersionsRule::toSimpleGav)
                        .collect(Collectors.toList());
        MatcherAssert.assertThat(
                ignored, org.hamcrest.Matchers.contains("javax.servlet:javax.servlet-api:2.1.0"));
    }

    static Artifact toArtifact(String simpleGav) {
        String[] split = simpleGav.split(":");
        return new DefaultArtifact(split[0], split[1], split[2], "", "", "", null);
    }
}
