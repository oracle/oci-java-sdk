/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The target to collect JFR data. A target is a managed instance, with options to further limit to specific application and/or Java Runtime.
 * When the applicationKey isn't specified, then all applications are selected.
 * When the jreKey isn't specified, then all supported Java Runtime versions are selected.
 * When the applicationInstallationKey isn't specified, then all application installations are selected.
 * Keys applicationKey and applicationInstallationKey are mutually exclusive.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JfrAttachmentTarget.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JfrAttachmentTarget extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "applicationKey",
        "applicationInstallationKey",
        "jreKey"
    })
    public JfrAttachmentTarget(
            String managedInstanceId,
            String applicationKey,
            String applicationInstallationKey,
            String jreKey) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.applicationKey = applicationKey;
        this.applicationInstallationKey = applicationInstallationKey;
        this.jreKey = jreKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the Managed Instance to collect JFR data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * OCID of the Managed Instance to collect JFR data.
         * @param managedInstanceId the value to set
         * @return this builder
         **/
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * Unique key that identifies the application for JFR data collection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * Unique key that identifies the application for JFR data collection.
         * @param applicationKey the value to set
         * @return this builder
         **/
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /**
         * Unique key that identifies the application installation for JFR data collection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
        private String applicationInstallationKey;

        /**
         * Unique key that identifies the application installation for JFR data collection.
         * @param applicationInstallationKey the value to set
         * @return this builder
         **/
        public Builder applicationInstallationKey(String applicationInstallationKey) {
            this.applicationInstallationKey = applicationInstallationKey;
            this.__explicitlySet__.add("applicationInstallationKey");
            return this;
        }
        /**
         * Unique key that identify the JVM for JFR data collection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jreKey")
        private String jreKey;

        /**
         * Unique key that identify the JVM for JFR data collection.
         * @param jreKey the value to set
         * @return this builder
         **/
        public Builder jreKey(String jreKey) {
            this.jreKey = jreKey;
            this.__explicitlySet__.add("jreKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JfrAttachmentTarget build() {
            JfrAttachmentTarget model =
                    new JfrAttachmentTarget(
                            this.managedInstanceId,
                            this.applicationKey,
                            this.applicationInstallationKey,
                            this.jreKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JfrAttachmentTarget model) {
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationInstallationKey")) {
                this.applicationInstallationKey(model.getApplicationInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("jreKey")) {
                this.jreKey(model.getJreKey());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * OCID of the Managed Instance to collect JFR data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * OCID of the Managed Instance to collect JFR data.
     * @return the value
     **/
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * Unique key that identifies the application for JFR data collection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * Unique key that identifies the application for JFR data collection.
     * @return the value
     **/
    public String getApplicationKey() {
        return applicationKey;
    }

    /**
     * Unique key that identifies the application installation for JFR data collection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
    private final String applicationInstallationKey;

    /**
     * Unique key that identifies the application installation for JFR data collection.
     * @return the value
     **/
    public String getApplicationInstallationKey() {
        return applicationInstallationKey;
    }

    /**
     * Unique key that identify the JVM for JFR data collection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreKey")
    private final String jreKey;

    /**
     * Unique key that identify the JVM for JFR data collection.
     * @return the value
     **/
    public String getJreKey() {
        return jreKey;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JfrAttachmentTarget(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", applicationInstallationKey=")
                .append(String.valueOf(this.applicationInstallationKey));
        sb.append(", jreKey=").append(String.valueOf(this.jreKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JfrAttachmentTarget)) {
            return false;
        }

        JfrAttachmentTarget other = (JfrAttachmentTarget) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(
                        this.applicationInstallationKey, other.applicationInstallationKey)
                && java.util.Objects.equals(this.jreKey, other.jreKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationInstallationKey == null
                                ? 43
                                : this.applicationInstallationKey.hashCode());
        result = (result * PRIME) + (this.jreKey == null ? 43 : this.jreKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
