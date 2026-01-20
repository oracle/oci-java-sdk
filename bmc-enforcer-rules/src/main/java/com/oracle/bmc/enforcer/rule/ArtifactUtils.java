/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.versioning.InvalidVersionSpecificationException;

class ArtifactUtils {
    /**
     * Returns a subset of dependency artifacts that match the given collection of patterns
     *
     * @param dependencies dependency artifacts to match against patterns
     * @param patterns patterns to match against the artifacts
     * @return a set containing artifacts matching one of the patterns or null
     */
    static Set<Artifact> filterDependencyArtifacts(
            Collection<Artifact> dependencies, Collection<String> patterns)
            throws IllegalArgumentException {
        return Optional.ofNullable(patterns)
                .map(
                        collection ->
                                collection.stream()
                                        .map(p -> p.split(":"))
                                        .map(ArtifactUtils::stripAll)
                                        .map(arr -> String.join(":", arr))
                                        .flatMap(
                                                pattern ->
                                                        dependencies.stream()
                                                                .filter(
                                                                        artifact ->
                                                                                compareDependency(
                                                                                        pattern,
                                                                                        artifact)))
                                        .collect(Collectors.toSet()))
                .orElse(null);
    }

    /**
     * Compares the given pattern against the given artifact. The pattern should follow the format
     * groupId:artifactId:version:type:scope:classifier.
     *
     * @param pattern The pattern to compare the artifact with
     * @param artifact the artifact
     * @return true if the artifact matches one of the patterns
     */
    static boolean compareDependency(String pattern, Artifact artifact) {
        try {
            return new ArtifactMatcher.Pattern(pattern).match(artifact);
        } catch (InvalidVersionSpecificationException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    private static String[] stripAll(String... strs) {
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].trim();
        }
        return strs;
    }
}
