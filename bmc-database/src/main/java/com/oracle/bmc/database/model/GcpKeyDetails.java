/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for GCP encryption key. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GcpKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "provider")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GcpKeyDetails extends AutonomousDatabaseEncryptionKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** GCP key name */
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * GCP key name
         *
         * @param keyName the value to set
         * @return this builder
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }
        /** GCP kms REST API endpoint */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsRestEndpoint")
        private String kmsRestEndpoint;

        /**
         * GCP kms REST API endpoint
         *
         * @param kmsRestEndpoint the value to set
         * @return this builder
         */
        public Builder kmsRestEndpoint(String kmsRestEndpoint) {
            this.kmsRestEndpoint = kmsRestEndpoint;
            this.__explicitlySet__.add("kmsRestEndpoint");
            return this;
        }
        /** GCP project name */
        @com.fasterxml.jackson.annotation.JsonProperty("project")
        private String project;

        /**
         * GCP project name
         *
         * @param project the value to set
         * @return this builder
         */
        public Builder project(String project) {
            this.project = project;
            this.__explicitlySet__.add("project");
            return this;
        }
        /** GCP key ring location */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * GCP key ring location
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** GCP key ring */
        @com.fasterxml.jackson.annotation.JsonProperty("keyRing")
        private String keyRing;

        /**
         * GCP key ring
         *
         * @param keyRing the value to set
         * @return this builder
         */
        public Builder keyRing(String keyRing) {
            this.keyRing = keyRing;
            this.__explicitlySet__.add("keyRing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GcpKeyDetails build() {
            GcpKeyDetails model =
                    new GcpKeyDetails(
                            this.keyName,
                            this.kmsRestEndpoint,
                            this.project,
                            this.location,
                            this.keyRing);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GcpKeyDetails model) {
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
            }
            if (model.wasPropertyExplicitlySet("kmsRestEndpoint")) {
                this.kmsRestEndpoint(model.getKmsRestEndpoint());
            }
            if (model.wasPropertyExplicitlySet("project")) {
                this.project(model.getProject());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("keyRing")) {
                this.keyRing(model.getKeyRing());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public GcpKeyDetails(
            String keyName,
            String kmsRestEndpoint,
            String project,
            String location,
            String keyRing) {
        super();
        this.keyName = keyName;
        this.kmsRestEndpoint = kmsRestEndpoint;
        this.project = project;
        this.location = location;
        this.keyRing = keyRing;
    }

    /** GCP key name */
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * GCP key name
     *
     * @return the value
     */
    public String getKeyName() {
        return keyName;
    }

    /** GCP kms REST API endpoint */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsRestEndpoint")
    private final String kmsRestEndpoint;

    /**
     * GCP kms REST API endpoint
     *
     * @return the value
     */
    public String getKmsRestEndpoint() {
        return kmsRestEndpoint;
    }

    /** GCP project name */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    private final String project;

    /**
     * GCP project name
     *
     * @return the value
     */
    public String getProject() {
        return project;
    }

    /** GCP key ring location */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * GCP key ring location
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** GCP key ring */
    @com.fasterxml.jackson.annotation.JsonProperty("keyRing")
    private final String keyRing;

    /**
     * GCP key ring
     *
     * @return the value
     */
    public String getKeyRing() {
        return keyRing;
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
        sb.append("GcpKeyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", keyName=").append(String.valueOf(this.keyName));
        sb.append(", kmsRestEndpoint=").append(String.valueOf(this.kmsRestEndpoint));
        sb.append(", project=").append(String.valueOf(this.project));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", keyRing=").append(String.valueOf(this.keyRing));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GcpKeyDetails)) {
            return false;
        }

        GcpKeyDetails other = (GcpKeyDetails) o;
        return java.util.Objects.equals(this.keyName, other.keyName)
                && java.util.Objects.equals(this.kmsRestEndpoint, other.kmsRestEndpoint)
                && java.util.Objects.equals(this.project, other.project)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.keyRing, other.keyRing)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsRestEndpoint == null ? 43 : this.kmsRestEndpoint.hashCode());
        result = (result * PRIME) + (this.project == null ? 43 : this.project.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.keyRing == null ? 43 : this.keyRing.hashCode());
        return result;
    }
}
