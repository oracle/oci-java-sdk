/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.enforcer.rule.api.EnforcerLogger;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.project.MavenProject;
import org.junit.Test;

import static com.oracle.bmc.enforcer.rule.NoMixedOciJavaSdkVersionsRule.BANNED_ARTIFACT_ID_PREFIX;
import static com.oracle.bmc.enforcer.rule.NoMixedOciJavaSdkVersionsRule.BANNED_GROUP_ID;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThrows;

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
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toSimpleGav)
                        .collect(Collectors.toList());
        assertThat(ignored.toString(), ignored, contains("javax.servlet:javax.servlet-api:2.1.0"));

        // try variations on allowedList
        allowedList.add("javax.crypto:javax.crypto");
        ignored =
                NoMixedOciJavaSdkVersionsRule.ignoredDependencies(artifacts, allowedList).stream()
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toSimpleGav)
                        .collect(Collectors.toList());
        assertThat(
                ignored.toString(),
                ignored,
                containsInAnyOrder(
                        "javax.crypto:javax.crypto:1", "javax.servlet:javax.servlet-api:2.1.0"));

        // with wildcards
        allowedList.add("*.servlet:*");
        ignored =
                NoMixedOciJavaSdkVersionsRule.ignoredDependencies(artifacts, allowedList).stream()
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toSimpleGav)
                        .collect(Collectors.toList());
        assertThat(
                ignored.toString(),
                ignored,
                containsInAnyOrder(
                        "javax.crypto:javax.crypto:1",
                        "javax.servlet:javax.servlet-api:2.1.0",
                        "other.servlet:other.servlet:1"));

        allowedList.add("*javax.inject*");
        ignored =
                NoMixedOciJavaSdkVersionsRule.ignoredDependencies(artifacts, allowedList).stream()
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toSimpleGav)
                        .collect(Collectors.toList());
        assertThat(
                ignored.toString(),
                ignored,
                containsInAnyOrder(
                        "javax.inject:javax.inject:1",
                        "javax.crypto:javax.crypto:1",
                        "javax.servlet:javax.servlet-api:2.1.0",
                        "other.servlet:other.servlet:1"));
    }

    @Test
    public void noAllowedDependenciesSpecified() {
        MavenProject project = new MavenProject();
        Set<Artifact> artifacts =
                Stream.of(
                                BANNED_GROUP_ID + ":" + BANNED_ARTIFACT_ID_PREFIX + "-lib1:1.0",
                                BANNED_GROUP_ID + ":" + BANNED_ARTIFACT_ID_PREFIX + "-lib2:1.0",
                                BANNED_GROUP_ID + ":" + BANNED_ARTIFACT_ID_PREFIX + "-lib3:2.0",
                                "javax.inject:javax.inject:1",
                                "javax.crypto:javax.crypto:1",
                                "javax.servlet:javax.servlet-api:2.1.0",
                                "other.servlet:other.servlet:1")
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toArtifact)
                        .collect(Collectors.toSet());
        project.setArtifacts(artifacts);

        // this is the way it will come in when someone uses <NoMixedOciJavaSdkVersions/>
        List<String> allowedList = new ArrayList<>();
        allowedList.add("");

        TestingLogger logger = new TestingLogger();
        NoMixedOciJavaSdkVersionsRule rule =
                new NoMixedOciJavaSdkVersionsRule(logger, project, allowedList);
        NoMixedOciJavaSdkVersionsException e =
                assertThrows(NoMixedOciJavaSdkVersionsException.class, rule::execute);
        assertThat(
                e.getMessage(),
                startsWith(
                        "Multiple different versions of com.oracle.oci.sdk:oci-java-sdk* dependencies have been found.\nMixing different versions is not allowed.\n"));
        assertThat(e.getVersionsInConflict().keySet(), containsInAnyOrder("1.0", "2.0"));
    }

    @Test
    public void distinguishTimedSnapshots() {
        MavenProject project = new MavenProject();
        Set<Artifact> artifacts =
                Stream.of(
                                BANNED_GROUP_ID
                                        + ":"
                                        + BANNED_ARTIFACT_ID_PREFIX
                                        + "-lib1:2.84.1-preview1-SNAPSHOT",
                                BANNED_GROUP_ID
                                        + ":"
                                        + BANNED_ARTIFACT_ID_PREFIX
                                        + "-lib2:2.84.1-preview1-20250522.215840-14(2.84.1-preview1-SNAPSHOT)",
                                BANNED_GROUP_ID
                                        + ":"
                                        + BANNED_ARTIFACT_ID_PREFIX
                                        + "-lib3:2.84.1-preview1-20250522.215840-13(2.84.1-preview1-SNAPSHOT)",
                                "javax.inject:javax.inject:1",
                                "javax.crypto:javax.crypto:1",
                                "javax.servlet:javax.servlet-api:2.1.0",
                                "other.servlet:other.servlet:1")
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toArtifact)
                        .collect(Collectors.toSet());
        project.setArtifacts(artifacts);

        // this is the way it will come in when someone uses <NoMixedOciJavaSdkVersions/>
        List<String> allowedList = new ArrayList<>();
        allowedList.add("");

        TestingLogger logger = new TestingLogger();
        NoMixedOciJavaSdkVersionsRule rule =
                new NoMixedOciJavaSdkVersionsRule(logger, project, allowedList, true);
        NoMixedOciJavaSdkVersionsException e =
                assertThrows(NoMixedOciJavaSdkVersionsException.class, rule::execute);
        assertThat(
                e.getMessage(),
                startsWith(
                        "Multiple different versions of com.oracle.oci.sdk:oci-java-sdk* dependencies have been found.\nMixing different versions is not allowed.\n"));
        assertThat(
                e.getVersionsInConflict().keySet(),
                containsInAnyOrder(
                        "2.84.1-preview1-20250522.215840-13",
                        "2.84.1-preview1-20250522.215840-14",
                        "2.84.1-preview1-SNAPSHOT"));
    }

    @Test
    public void doNotDistinguishTimedSnapshots() throws EnforcerRuleException {
        MavenProject project = new MavenProject();
        Set<Artifact> artifacts =
                Stream.of(
                                BANNED_GROUP_ID
                                        + ":"
                                        + BANNED_ARTIFACT_ID_PREFIX
                                        + "-lib1:2.84.1-preview1-SNAPSHOT",
                                BANNED_GROUP_ID
                                        + ":"
                                        + BANNED_ARTIFACT_ID_PREFIX
                                        + "-lib2:2.84.1-preview1-20250522.215840-14(2.84.1-preview1-SNAPSHOT)",
                                BANNED_GROUP_ID
                                        + ":"
                                        + BANNED_ARTIFACT_ID_PREFIX
                                        + "-lib3:2.84.1-preview1-20250522.215840-13(2.84.1-preview1-SNAPSHOT)",
                                "javax.inject:javax.inject:1",
                                "javax.crypto:javax.crypto:1",
                                "javax.servlet:javax.servlet-api:2.1.0",
                                "other.servlet:other.servlet:1")
                        .map(NoMixedOciJavaSdkVersionsRuleTest::toArtifact)
                        .collect(Collectors.toSet());
        project.setArtifacts(artifacts);

        // this is the way it will come in when someone uses <NoMixedOciJavaSdkVersions/>
        List<String> allowedList = new ArrayList<>();
        allowedList.add("");

        TestingLogger logger = new TestingLogger();
        NoMixedOciJavaSdkVersionsRule rule =
                new NoMixedOciJavaSdkVersionsRule(logger, project, allowedList, false);
        rule.execute();
    }

    static Artifact toArtifact(String simpleGav) {
        String[] split = simpleGav.split(":");
        String version = split[2];
        String baseVersion = null;
        if (version.contains("(") && version.contains("-SNAPSHOT)")) {
            baseVersion = version.substring(version.indexOf("(") + 1, version.indexOf(")"));
            version = version.substring(0, version.indexOf("("));
        }
        DefaultArtifact a = new DefaultArtifact(split[0], split[1], version, "", "", "", null);
        if (baseVersion != null) {
            a.setBaseVersion(baseVersion);
        }
        return a;
    }

    static String toSimpleGav(Artifact gav) {
        return gav.getGroupId() + ":" + gav.getArtifactId() + ":" + gav.getVersion();
    }

    static class TestingLogger implements EnforcerLogger {
        static final Logger LOGGER = Logger.getLogger(TestingLogger.class.getName());

        @Override
        public void warnOrError(CharSequence charSequence) {
            LOGGER.warning(charSequence.toString());
        }

        @Override
        public void warnOrError(Supplier<CharSequence> supplier) {
            warnOrError(supplier.get());
        }

        @Override
        public boolean isDebugEnabled() {
            return LOGGER.isLoggable(Level.FINE);
        }

        @Override
        public void debug(CharSequence charSequence) {
            LOGGER.log(Level.FINE, charSequence.toString());
        }

        @Override
        public void debug(Supplier<CharSequence> supplier) {
            debug(supplier.get());
        }

        @Override
        public boolean isInfoEnabled() {
            return LOGGER.isLoggable(Level.INFO);
        }

        @Override
        public void info(CharSequence charSequence) {
            LOGGER.log(Level.INFO, charSequence.toString());
        }

        @Override
        public void info(Supplier<CharSequence> supplier) {
            info(supplier.get());
        }

        @Override
        public boolean isWarnEnabled() {
            return LOGGER.isLoggable(Level.WARNING);
        }

        @Override
        public void warn(CharSequence charSequence) {
            LOGGER.log(Level.WARNING, charSequence.toString());
        }

        @Override
        public void warn(Supplier<CharSequence> supplier) {
            warn(supplier.get());
        }

        @Override
        public boolean isErrorEnabled() {
            return LOGGER.isLoggable(Level.SEVERE);
        }

        @Override
        public void error(CharSequence charSequence) {
            LOGGER.log(Level.SEVERE, charSequence.toString());
        }

        @Override
        public void error(Supplier<CharSequence> supplier) {
            error(supplier.get());
        }
    }
}
