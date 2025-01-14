/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.enforcer.rule.api.EnforcerRule;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.enforcer.rule.api.EnforcerRuleHelper;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException;

import java.util.HashSet;
import java.util.Set;

public class NoMultipleTransportLayersRule implements EnforcerRule {
    public static final String TRANSPORT_LAYER_ARTIFACT_ID_PREFIX =
            "oci-java-sdk-common-httpclient-";

    public void execute(EnforcerRuleHelper helper) throws EnforcerRuleException {
        MavenProject project;
        try {
            project = (MavenProject) helper.evaluate("${project}");
        } catch (ExpressionEvaluationException eee) {
            throw new EnforcerRuleException("Unable to retrieve the MavenProject: ", eee);
        }

        Set<Artifact> dependencies = project.getArtifacts();
        Set<Artifact> transportLayers = new HashSet<>();

        for (Artifact dependency : dependencies) {
            if (dependency.getArtifactId().startsWith(TRANSPORT_LAYER_ARTIFACT_ID_PREFIX))
                transportLayers.add(dependency);
        }

        if (transportLayers.size() > 1) {
            StringBuilder buf = new StringBuilder();

            buf.append("Multiple transport layers are being used.");
            buf.append(System.lineSeparator());

            for (Artifact transportLayer : transportLayers) {
                buf.append("->" + transportLayer.getArtifactId());
                buf.append(System.lineSeparator());
            }

            buf.append(
                    "Please use single jersey http client dependency. Use 'mvn dependency:tree' to locate the source of the dependencies.");
            throw new EnforcerRuleException(buf.toString());
        }
    }

    /**
     * If your rule is cacheable, you must return a unique id when parameters or conditions change
     * that would cause the result to be different. Multiple cached results are stored based on
     * their id.
     *
     * <p>The easiest way to do this is to return a hash computed from the values of your
     * parameters.
     *
     * <p>If your rule is not cacheable, then the result here is not important, you may return
     * anything.
     */
    public String getCacheId() {
        return this.getClass().getSimpleName() + "-notCacheable";
    }

    /**
     * This tells the system if the results are cacheable at all. Keep in mind that during forked
     * builds and other things, a given rule may be executed more than once for the same project.
     * This means that even things that change from project to project may still be cacheable in
     * certain instances.
     */
    public boolean isCacheable() {
        return false;
    }

    /**
     * If the rule is cacheable and the same id is found in the cache, the stored results are passed
     * to this method to allow double checking of the results. Most of the time this can be done by
     * generating unique ids, but sometimes the results of objects returned by the helper need to be
     * queried. You may for example, store certain objects in your rule and then query them later.
     */
    public boolean isResultValid(EnforcerRule rule) {
        return false;
    }
}
