/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.resolver.filter.ArtifactFilter;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.enforcer.rule.api.EnforcerRuleHelper;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.enforcer.AbstractNonCacheableEnforcerRule;
import org.apache.maven.plugins.enforcer.utils.ArtifactUtils;
import org.apache.maven.project.DefaultProjectBuildingRequest;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.ProjectBuildingRequest;
import org.apache.maven.shared.dependency.graph.DependencyGraphBuilder;
import org.apache.maven.shared.dependency.graph.DependencyGraphBuilderException;
import org.apache.maven.shared.dependency.graph.DependencyNode;
import org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException;
import org.codehaus.plexus.component.repository.exception.ComponentLookupException;

/** Enforcer to ensure there are no mixed OCI Java SDK versions. */
public class NoMixedOciJavaSdkVersionsRule extends AbstractNonCacheableEnforcerRule {

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
     * @see {@link #setAllowedDependencies(List)} (List)}
     * @see {@link #getAllowedDependencies()} ()}
     */
    private List<String> allowedDependencies = null;

    private boolean searchTransitive = true;

    private transient DependencyGraphBuilder graphBuilder;

    @Override
    public void execute(EnforcerRuleHelper helper) throws EnforcerRuleException {
        MavenProject project;
        try {
            project = (MavenProject) helper.evaluate("${project}");
        } catch (ExpressionEvaluationException eee) {
            throw new EnforcerRuleException("Unable to retrieve the MavenProject: ", eee);
        }

        MavenSession session;
        try {
            session = (MavenSession) helper.evaluate("${session}");
        } catch (ExpressionEvaluationException eee) {
            throw new EnforcerRuleException("Unable to retrieve the MavenSession: ", eee);
        }

        try {
            this.graphBuilder = helper.getComponent(DependencyGraphBuilder.class);
        } catch (ComponentLookupException cle) {
            throw new EnforcerRuleException("Unable to lookup DependencyGraphBuilder: ", cle);
        }

        ProjectBuildingRequest buildingRequest =
                new DefaultProjectBuildingRequest(session.getProjectBuildingRequest());
        buildingRequest.setProject(project);
        Set<Artifact> dependencies = this.getDependenciesToCheck(helper, buildingRequest);
        Map<String, Set<Artifact>> versions = this.checkDependencies(dependencies, helper.getLog());
        if (versions.size() > 1) {
            String message = this.getMessage();
            StringBuilder buf = new StringBuilder();

            if (message != null) {
                buf.append(message).append(System.lineSeparator());
            }

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

    protected Map<String, Set<Artifact>> checkDependencies(Set<Artifact> dependencies, Log log)
            throws EnforcerRuleException {
        Map<String, Set<Artifact>> versions = new HashMap<>();

        for (Artifact dependency : dependencies) {
            log.debug("Checking dependency " + dependency.getId());
            if (!BANNED_GROUP_ID.equals(dependency.getGroupId())) {
                log.debug("Ignoring, not groupId " + BANNED_GROUP_ID);
                continue;
            }

            if (dependency.getArtifactId() == null
                    || !dependency.getArtifactId().startsWith(BANNED_ARTIFACT_ID_PREFIX)) {
                log.debug("Ignoring, artifactId not prefixed by " + BANNED_ARTIFACT_ID_PREFIX);
                continue;
            }

            if (dependency.getVersion() != null) {
                Set<Artifact> artifactSet = versions.get(dependency.getVersion());
                if (artifactSet == null) {
                    artifactSet = new HashSet<>();
                    versions.put(dependency.getVersion(), artifactSet);
                }
                log.debug("Recording version " + dependency.getVersion());
                artifactSet.add(dependency);
            }
        }

        // anything specifically allowedDependencies should be removed from the ban list.
        Set<Artifact> ignored = ArtifactUtils.checkDependencies(dependencies, allowedDependencies);

        if (ignored != null) {
            log.debug(
                    "Dependencies to ignore found: "
                            + ignored.stream()
                                    .map(a -> a.getId())
                                    .collect(Collectors.joining(", ")));
            Iterator<String> versionsIt = versions.keySet().iterator();
            while (versionsIt.hasNext()) {
                String version = versionsIt.next();
                log.debug("Checking version" + version);
                Set<Artifact> artifactSet = versions.get(version);
                if (artifactSet != null) {
                    log.debug(
                            "Artifacts in version "
                                    + version
                                    + " before: "
                                    + artifactSet
                                            .stream()
                                            .map(a -> a.getId())
                                            .collect(Collectors.joining(", ")));
                    artifactSet.removeAll(ignored);
                    log.debug(
                            "Artifacts in version "
                                    + version
                                    + " after: "
                                    + artifactSet
                                            .stream()
                                            .map(a -> a.getId())
                                            .collect(Collectors.joining(", ")));
                }
                if (artifactSet == null || artifactSet.isEmpty()) {
                    log.debug("Version " + version + " is now empty, removing");
                    versionsIt.remove();
                    ;
                }
            }
        }

        log.debug(
                "Different versions found: " + versions.keySet().size() + ": " + versions.keySet());

        return versions;
    }

    public List<String> getAllowedDependencies() {
        return allowedDependencies;
    }

    public void setAllowedDependencies(List<String> allowed) {
        this.allowedDependencies = allowed;
    }

    private Set<Artifact> getDependenciesToCheck(
            EnforcerRuleHelper helper, ProjectBuildingRequest buildingRequest) {
        String cacheKey = buildingRequest.getProject().getId() + "_" + this.searchTransitive;
        return (Set) helper.getCache(cacheKey, () -> this.getDependenciesToCheck(buildingRequest));
    }

    protected Set<Artifact> getDependenciesToCheck(ProjectBuildingRequest buildingRequest) {
        Object dependencies = null;

        try {
            DependencyNode node =
                    this.graphBuilder.buildDependencyGraph(buildingRequest, (ArtifactFilter) null);
            if (this.searchTransitive) {
                dependencies = ArtifactUtils.getAllDescendants(node);
            } else if (node.getChildren() != null) {
                dependencies = new HashSet();
                Iterator it = node.getChildren().iterator();

                while (it.hasNext()) {
                    DependencyNode depNode = (DependencyNode) it.next();
                    ((Set) dependencies).add(depNode.getArtifact());
                }
            }

            return (Set) dependencies;
        } catch (DependencyGraphBuilderException var6) {
            throw new RuntimeException(var6);
        }
    }
}
