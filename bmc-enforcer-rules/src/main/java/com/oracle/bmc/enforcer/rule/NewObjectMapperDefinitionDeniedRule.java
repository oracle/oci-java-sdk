/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.enforcer.rule;

import org.apache.maven.enforcer.rule.api.EnforcerRule;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.enforcer.rule.api.EnforcerRuleHelper;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Enforcer to ensure no new ObjectMapper objects are created in OCI Java SDK except in
 * Serialization.java The ObjectMapper defined in Serialization.java should be re-used as
 * com.oracle.bmc.http.Serialization.getObjectMapper() Any new ObjectMapper object (including any
 * form of constructors) will cause the build to fail.
 */
public class NewObjectMapperDefinitionDeniedRule implements EnforcerRule {

    private String excludeClasses;

    // This regex will match any string that looks like "new ObjectMapper" or "new
    // com.fasterxml.jackson.databind.ObjectMapper" ignoring all the whitespaces
    private static final String REGEX_TO_FIND_NEW_OBJECT_MAPPER_DEFINITION =
            ".*new\\s+(ObjectMapper|com\\s?[.]\\s?fasterxml\\s?[.]\\s?jackson\\s?[.]\\s?databind\\s?[.]\\s?ObjectMapper).*";

    @Override
    public void execute(EnforcerRuleHelper helper) throws EnforcerRuleException {
        Log log = helper.getLog();
        String[] ignoreClasses = (excludeClasses != null ? excludeClasses : "").split(",");
        log.info(
                "Classes that can create new ObjectMapper objects: "
                        + Arrays.toString(ignoreClasses));

        try {
            MavenProject project = (MavenProject) helper.evaluate("${project}");
            File baseDir = project.getBasedir();
            if (baseDir.exists() && baseDir.isDirectory()) {
                List<File> javaFiles = FileUtils.getFiles(baseDir, "**/*.java", "target/");
                log.info("Reading all Java files in base directory " + baseDir);
                for (File javaFile : javaFiles) {
                    if (Arrays.stream(ignoreClasses).noneMatch(javaFile.getName()::endsWith)) {

                        // Read the file as a string and eliminate additional whitespaces
                        String readLinesFromFile =
                                FileUtils.fileRead(javaFile).trim().replaceAll("\\s+", " ");
                        boolean newObjectMapperDefined =
                                readLinesFromFile.matches(
                                        REGEX_TO_FIND_NEW_OBJECT_MAPPER_DEFINITION);

                        if (newObjectMapperDefined) {
                            throw new EnforcerRuleException(
                                    "New ObjectMapper defined in "
                                            + javaFile.getAbsolutePath()
                                            + ". Please re-use the ObjectMapper defined in Serialization.java by calling com.oracle.bmc.http.Serialization.getObjectMapper().");
                        }
                    }
                }
            }
        } catch (ExpressionEvaluationException ex) {
            throw new EnforcerRuleException(
                    "Unable to lookup an expression " + ex.getLocalizedMessage(), ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
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
