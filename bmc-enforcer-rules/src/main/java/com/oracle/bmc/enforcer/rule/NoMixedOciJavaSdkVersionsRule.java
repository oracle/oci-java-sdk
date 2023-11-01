/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.enforcer.rule.api.AbstractEnforcerRule;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.project.DefaultProjectBuildingRequest;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.ProjectBuildingRequest;

/** Enforcer to ensure there are no mixed OCI Java SDK versions. */
@Named("noMixedOciJavaSdkVersionsRule")
@SuppressWarnings("unused")
public class NoMixedOciJavaSdkVersionsRule extends AbstractEnforcerRule {

    public static final String BANNED_GROUP_ID = "com.oracle.oci.sdk";
    public static final String BANNED_ARTIFACT_ID_PREFIX = "oci-java-sdk";

    /**
     * Specify the allowedDependencies dependencies. This can be a list of artifacts in the format
     * <code>
     * groupId[:artifactId][:version]</code>. Any of the sections can be a wildcard by using '*' (ie
     * group:*:1.0) <br>
     * Includes override the exclude rules. It is meant to allow wide exclusion rules with wildcards
     * and still allow a smaller set of includes. <br>
     * For example, to allow "com.oracle.oci.sdk:oci-java-sdk-core", allow
     * "com.oracle.oci.sdk:oci-java-sdk-core"
     *
     * @see {@link #setAllowedDependencies(List)}
     * @see {@link #getAllowedDependencies()} ()}
     */
    @Inject private List<String> allowedDependencies;

    @Inject private MavenProject project;

    @Inject private MavenSession session;

    @Override
    public void execute() throws EnforcerRuleException {
        Objects.requireNonNull(
                project,
                "'project' was expected to be injected. Are you using maven enforcer v >= 3.4.0?");
        Objects.requireNonNull(
                session,
                "'session' was expected to be injected. Are you using maven enforcer v >= 3.4.0?");
        Objects.requireNonNull(
                allowedDependencies,
                "'allowedDependencies' was expected to be injected. Are you using maven v >= 3.8.1?");

        ProjectBuildingRequest buildingRequest =
                new DefaultProjectBuildingRequest(session.getProjectBuildingRequest());
        buildingRequest.setProject(project);
        Set<Artifact> dependencies = getDependenciesToCheck();
        Map<String, Set<Artifact>> versions = checkDependencies(dependencies);
        if (versions.size() > 1) {
            StringBuilder buf = new StringBuilder();
            buf.append("Multiple different versions of ")
                    .append(BANNED_GROUP_ID)
                    .append(":")
                    .append(BANNED_ARTIFACT_ID_PREFIX)
                    .append("* dependencies have been found.")
                    .append(System.lineSeparator());
            buf.append("Mixing different versions is not allowedDependencies.")
                    .append(System.lineSeparator());

            for (String version : versions.keySet()) {
                buf.append("Using version ")
                        .append(version)
                        .append(":")
                        .append(System.lineSeparator());
                for (Artifact artifact : versions.get(version)) {
                    buf.append('\t').append(artifact.getId()).append(System.lineSeparator());
                }
            }

            buf.append(
                    "Use 'mvn dependency:tree' to locate the source of the dependencies with the mixed versions.");
            throw new EnforcerRuleException(buf.toString());
        }
    }

    protected Map<String, Set<Artifact>> checkDependencies(Set<Artifact> dependencies) {
        Map<String, Set<Artifact>> versions = new HashMap<>();

        for (Artifact dependency : dependencies) {
            getLog().debug("Checking dependency " + dependency.getId());
            if (!BANNED_GROUP_ID.equals(dependency.getGroupId())) {
                getLog().debug("Ignoring, not groupId " + BANNED_GROUP_ID);
                continue;
            }

            if (dependency.getArtifactId() == null
                    || !dependency.getArtifactId().startsWith(BANNED_ARTIFACT_ID_PREFIX)) {
                getLog().debug("Ignoring, artifactId not prefixed by " + BANNED_ARTIFACT_ID_PREFIX);
                continue;
            }

            if (dependency.getVersion() != null) {
                Set<Artifact> artifactSet = versions.get(dependency.getVersion());
                if (artifactSet == null) {
                    artifactSet = new HashSet<>();
                    versions.put(dependency.getVersion(), artifactSet);
                }
                getLog().debug("Recording version " + dependency.getVersion());
                artifactSet.add(dependency);
            }
        }

        // anything specifically allowedDependencies should be removed from the ban list
        List<Artifact> ignored = ignoredDependencies(dependencies, allowedDependencies);
        if (!ignored.isEmpty()) {
            getLog().debug(
                            "Dependencies to ignore found: "
                                    + ignored.stream()
                                            .map(Artifact::getId)
                                            .collect(Collectors.joining(", ")));
            Iterator<String> versionsIt = versions.keySet().iterator();
            while (versionsIt.hasNext()) {
                String version = versionsIt.next();
                getLog().debug("Checking version" + version);
                Set<Artifact> artifactSet = versions.get(version);
                if (artifactSet != null) {
                    getLog().debug(
                                    "Artifacts in version "
                                            + version
                                            + " before: "
                                            + artifactSet.stream()
                                                    .map(Artifact::getId)
                                                    .collect(Collectors.joining(", ")));
                    artifactSet.removeAll(ignored);
                    getLog().debug(
                                    "Artifacts in version "
                                            + version
                                            + " after: "
                                            + artifactSet.stream()
                                                    .map(Artifact::getId)
                                                    .collect(Collectors.joining(", ")));
                }
                if (artifactSet == null || artifactSet.isEmpty()) {
                    getLog().debug("Version " + version + " is now empty, removing");
                    versionsIt.remove();
                }
            }
        }

        getLog().debug(
                        "Different versions found: "
                                + versions.keySet().size()
                                + ": "
                                + versions.keySet());

        return versions;
    }

    public List<String> getAllowedDependencies() {
        return allowedDependencies;
    }

    public void setAllowedDependencies(List<String> allowed) {
        this.allowedDependencies = allowed;
    }

    private Set<Artifact> getDependenciesToCheck() {
        // this will be transitive in nature
        return project.getArtifacts().stream()
                .filter(
                        a ->
                                a.getScope().equalsIgnoreCase("compile")
                                        || a.getScope().equalsIgnoreCase("runtime"))
                .filter(a -> !a.isOptional())
                .collect(Collectors.toSet());
    }

    static List<Artifact> ignoredDependencies(
            Collection<Artifact> dependencies, List<String> allowedDependencies) {
        Set<Pattern> filteredOut =
                allowedDependencies.stream()
                        .filter(s -> !s.isEmpty())
                        .map(Pattern::compile)
                        .collect(Collectors.toSet());
        return dependencies.stream()
                .filter(dep -> filteredOut(dep, filteredOut))
                .collect(Collectors.toList());
    }

    private static boolean filteredOut(Artifact dep, Set<Pattern> filteredOut) {
        String simpleGav = toSimpleGav(dep);
        for (Pattern pattern : filteredOut) {
            if (pattern.matcher(simpleGav).matches()) {
                return true;
            }
        }
        return false;
    }

    static String toSimpleGav(Artifact gav) {
        return gav.getGroupId() + ":" + gav.getArtifactId() + ":" + gav.getVersion();
    }
}
