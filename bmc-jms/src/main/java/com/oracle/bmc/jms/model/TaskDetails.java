/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The minimum details of a task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "taskType",
        defaultImpl = TaskDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeployedApplicationMigrationTaskDetails.class,
            name = "DEPLOYED_APPLICATION_MIGRATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RemoveInstallationSiteTaskDetails.class,
            name = "REMOVE_INSTALLATION_SITE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CryptoTaskDetails.class,
            name = "CRYPTO"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = JavaMigrationTaskDetails.class,
            name = "JAVA_MIGRATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ScanLibraryTaskDetails.class,
            name = "SCAN_LIBRARY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PerformanceTuningTaskDetails.class,
            name = "PERFORMANCE_TUNING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ScanJavaServerTaskDetails.class,
            name = "SCAN_JAVA_SERVER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JfrTaskDetails.class, name = "JFR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AddInstallationSiteTaskDetails.class,
            name = "ADD_INSTALLATION_SITE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class TaskDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected TaskDetails() {
        super();
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TaskDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskDetails)) {
            return false;
        }

        TaskDetails other = (TaskDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of task. */
    public enum TaskType implements com.oracle.bmc.http.internal.BmcEnum {
        Crypto("CRYPTO"),
        Jfr("JFR"),
        ScanLibrary("SCAN_LIBRARY"),
        ScanJavaServer("SCAN_JAVA_SERVER"),
        JavaMigration("JAVA_MIGRATION"),
        DeployedApplicationMigration("DEPLOYED_APPLICATION_MIGRATION"),
        PerformanceTuning("PERFORMANCE_TUNING"),
        AddInstallationSite("ADD_INSTALLATION_SITE"),
        RemoveInstallationSite("REMOVE_INSTALLATION_SITE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TaskType.class);

        private final String value;
        private static java.util.Map<String, TaskType> map;

        static {
            map = new java.util.HashMap<>();
            for (TaskType v : TaskType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TaskType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TaskType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TaskType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
