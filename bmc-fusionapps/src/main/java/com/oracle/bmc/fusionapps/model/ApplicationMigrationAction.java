/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Action indicating a SaaS application migrating to Fusion Applications. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApplicationMigrationAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "actionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApplicationMigrationAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("referenceKey")
        private String referenceKey;

        public Builder referenceKey(String referenceKey) {
            this.referenceKey = referenceKey;
            this.__explicitlySet__.add("referenceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Name of SaaS Application being migrated. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        /**
         * Name of SaaS Application being migrated.
         *
         * @param applicationType the value to set
         * @return this builder
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }
        /** Source environment name derived from source pod name */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceEnvironmentName")
        private String sourceEnvironmentName;

        /**
         * Source environment name derived from source pod name
         *
         * @param sourceEnvironmentName the value to set
         * @return this builder
         */
        public Builder sourceEnvironmentName(String sourceEnvironmentName) {
            this.sourceEnvironmentName = sourceEnvironmentName;
            this.__explicitlySet__.add("sourceEnvironmentName");
            return this;
        }
        /** Source environment id derived from appman instance id */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceEnvironmentId")
        private String sourceEnvironmentId;

        /**
         * Source environment id derived from appman instance id
         *
         * @param sourceEnvironmentId the value to set
         * @return this builder
         */
        public Builder sourceEnvironmentId(String sourceEnvironmentId) {
            this.sourceEnvironmentId = sourceEnvironmentId;
            this.__explicitlySet__.add("sourceEnvironmentId");
            return this;
        }
        /** Source environment url derived from source url */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceEnvironmentUrl")
        private String sourceEnvironmentUrl;

        /**
         * Source environment url derived from source url
         *
         * @param sourceEnvironmentUrl the value to set
         * @return this builder
         */
        public Builder sourceEnvironmentUrl(String sourceEnvironmentUrl) {
            this.sourceEnvironmentUrl = sourceEnvironmentUrl;
            this.__explicitlySet__.add("sourceEnvironmentUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationMigrationAction build() {
            ApplicationMigrationAction model =
                    new ApplicationMigrationAction(
                            this.referenceKey,
                            this.state,
                            this.description,
                            this.applicationType,
                            this.sourceEnvironmentName,
                            this.sourceEnvironmentId,
                            this.sourceEnvironmentUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationMigrationAction model) {
            if (model.wasPropertyExplicitlySet("referenceKey")) {
                this.referenceKey(model.getReferenceKey());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("applicationType")) {
                this.applicationType(model.getApplicationType());
            }
            if (model.wasPropertyExplicitlySet("sourceEnvironmentName")) {
                this.sourceEnvironmentName(model.getSourceEnvironmentName());
            }
            if (model.wasPropertyExplicitlySet("sourceEnvironmentId")) {
                this.sourceEnvironmentId(model.getSourceEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceEnvironmentUrl")) {
                this.sourceEnvironmentUrl(model.getSourceEnvironmentUrl());
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
    public ApplicationMigrationAction(
            String referenceKey,
            State state,
            String description,
            String applicationType,
            String sourceEnvironmentName,
            String sourceEnvironmentId,
            String sourceEnvironmentUrl) {
        super(referenceKey, state, description);
        this.applicationType = applicationType;
        this.sourceEnvironmentName = sourceEnvironmentName;
        this.sourceEnvironmentId = sourceEnvironmentId;
        this.sourceEnvironmentUrl = sourceEnvironmentUrl;
    }

    /** Name of SaaS Application being migrated. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final String applicationType;

    /**
     * Name of SaaS Application being migrated.
     *
     * @return the value
     */
    public String getApplicationType() {
        return applicationType;
    }

    /** Source environment name derived from source pod name */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEnvironmentName")
    private final String sourceEnvironmentName;

    /**
     * Source environment name derived from source pod name
     *
     * @return the value
     */
    public String getSourceEnvironmentName() {
        return sourceEnvironmentName;
    }

    /** Source environment id derived from appman instance id */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEnvironmentId")
    private final String sourceEnvironmentId;

    /**
     * Source environment id derived from appman instance id
     *
     * @return the value
     */
    public String getSourceEnvironmentId() {
        return sourceEnvironmentId;
    }

    /** Source environment url derived from source url */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEnvironmentUrl")
    private final String sourceEnvironmentUrl;

    /**
     * Source environment url derived from source url
     *
     * @return the value
     */
    public String getSourceEnvironmentUrl() {
        return sourceEnvironmentUrl;
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
        sb.append("ApplicationMigrationAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", sourceEnvironmentName=").append(String.valueOf(this.sourceEnvironmentName));
        sb.append(", sourceEnvironmentId=").append(String.valueOf(this.sourceEnvironmentId));
        sb.append(", sourceEnvironmentUrl=").append(String.valueOf(this.sourceEnvironmentUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationMigrationAction)) {
            return false;
        }

        ApplicationMigrationAction other = (ApplicationMigrationAction) o;
        return java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.sourceEnvironmentName, other.sourceEnvironmentName)
                && java.util.Objects.equals(this.sourceEnvironmentId, other.sourceEnvironmentId)
                && java.util.Objects.equals(this.sourceEnvironmentUrl, other.sourceEnvironmentUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEnvironmentName == null
                                ? 43
                                : this.sourceEnvironmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEnvironmentId == null
                                ? 43
                                : this.sourceEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEnvironmentUrl == null
                                ? 43
                                : this.sourceEnvironmentUrl.hashCode());
        return result;
    }
}
