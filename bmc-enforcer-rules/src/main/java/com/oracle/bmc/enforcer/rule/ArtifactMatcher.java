/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import java.util.Collection;
import java.util.LinkedList;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
import org.apache.maven.artifact.versioning.InvalidVersionSpecificationException;
import org.apache.maven.artifact.versioning.VersionRange;

class ArtifactMatcher {
    private final Collection<Pattern> patterns = new LinkedList<>();
    private final Collection<Pattern> ignorePatterns = new LinkedList<>();

    static class Pattern {
        private String pattern;
        private String[] parts;

        Pattern(String pattern) {
            if (pattern == null) {
                throw new NullPointerException("pattern");
            }

            this.pattern = pattern;

            parts = pattern.split(":", 7);

            if (parts.length == 7) {
                throw new IllegalArgumentException("Pattern contains too many delimiters.");
            }

            for (String part : parts) {
                if ("".equals(part)) {
                    throw new IllegalArgumentException("Pattern or its part is empty.");
                }
            }
        }

        boolean match(Artifact artifact) throws InvalidVersionSpecificationException {
            if (artifact == null) {
                throw new NullPointerException("artifact");
            }

            switch (parts.length) {
                case 6:
                    String classifier = artifact.getClassifier();
                    if (!matches(parts[5], classifier)) {
                        return false;
                    }
                case 5:
                    String scope = artifact.getScope();
                    if (scope == null || scope.equals("")) {
                        scope = Artifact.SCOPE_COMPILE;
                    }

                    if (!matches(parts[4], scope)) {
                        return false;
                    }
                case 4:
                    String type = artifact.getType();
                    if (type == null || type.equals("")) {
                        type = "jar";
                    }

                    if (!matches(parts[3], type)) {
                        return false;
                    }

                case 3:
                    if (!matches(parts[2], artifact.getVersion())) {
                        // CHECKSTYLE_OFF: LineLength
                        if (!containsVersion(
                                VersionRange.createFromVersionSpec(parts[2]),
                                new DefaultArtifactVersion(artifact.getVersion())))
                        // CHECKSTYLE_ON: LineLength
                        {
                            return false;
                        }
                    }

                case 2:
                    if (!matches(parts[1], artifact.getArtifactId())) {
                        return false;
                    }

                case 1:
                    return matches(parts[0], artifact.getGroupId());

                default:
                    throw new AssertionError();
            }
        }

        private boolean matches(String expression, String input) {
            String regex =
                    expression
                            .replace(".", "\\.")
                            .replace("*", ".*")
                            .replace(":", "\\:")
                            .replace('?', '.')
                            .replace("[", "\\[")
                            .replace("]", "\\]")
                            .replace("(", "\\(")
                            .replace(")", "\\)");

            if (input == null) {
                input = "";
            }

            return java.util.regex.Pattern.matches(regex, input);
        }

        @Override
        public String toString() {
            return pattern;
        }
    }

    /**
     * Construct class by providing patterns as strings. Empty strings are ignored.
     *
     * @param patterns includes
     * @param ignorePatterns excludes
     * @throws NullPointerException if any of the arguments is null
     */
    ArtifactMatcher(final Collection<String> patterns, final Collection<String> ignorePatterns) {
        if (patterns == null) {
            throw new NullPointerException("patterns");
        }
        if (ignorePatterns == null) {
            throw new NullPointerException("ignorePatterns");
        }
        for (String pattern : patterns) {
            if (pattern != null && !"".equals(pattern)) {
                this.patterns.add(new Pattern(pattern));
            }
        }

        for (String ignorePattern : ignorePatterns) {
            if (ignorePattern != null && !"".equals(ignorePattern)) {
                this.ignorePatterns.add(new Pattern(ignorePattern));
            }
        }
    }

    /**
     * Check if artifact matches patterns.
     *
     * @param artifact the artifact to match
     * @return {@code true} if artifact matches any {@link #patterns} and none of the {@link
     *     #ignorePatterns}, otherwise {@code false}
     */
    boolean match(Artifact artifact) throws InvalidVersionSpecificationException {
        for (Pattern pattern : patterns) {
            if (pattern.match(artifact)) {
                for (Pattern ignorePattern : ignorePatterns) {
                    if (ignorePattern.match(artifact)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static boolean containsVersion(VersionRange allowedRange, ArtifactVersion theVersion) {
        ArtifactVersion recommendedVersion = allowedRange.getRecommendedVersion();
        if (recommendedVersion == null) {
            return allowedRange.containsVersion(theVersion);
        } else {
            int compareTo = recommendedVersion.compareTo(theVersion);
            return compareTo <= 0;
        }
    }
}
