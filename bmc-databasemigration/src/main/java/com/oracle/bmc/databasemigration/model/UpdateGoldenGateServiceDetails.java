/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about the Oracle GoldenGate Microservices. If an empty object is specified, the stored
 * Golden Gate details will be removed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateGoldenGateServiceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateGoldenGateServiceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceDbCredentials",
        "sourceContainerDbCredentials",
        "targetDbCredentials",
        "settings"
    })
    public UpdateGoldenGateServiceDetails(
            DatabaseCredentials sourceDbCredentials,
            DatabaseCredentials sourceContainerDbCredentials,
            DatabaseCredentials targetDbCredentials,
            UpdateGoldenGateSettings settings) {
        super();
        this.sourceDbCredentials = sourceDbCredentials;
        this.sourceContainerDbCredentials = sourceContainerDbCredentials;
        this.targetDbCredentials = targetDbCredentials;
        this.settings = settings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDbCredentials")
        private DatabaseCredentials sourceDbCredentials;

        public Builder sourceDbCredentials(DatabaseCredentials sourceDbCredentials) {
            this.sourceDbCredentials = sourceDbCredentials;
            this.__explicitlySet__.add("sourceDbCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbCredentials")
        private DatabaseCredentials sourceContainerDbCredentials;

        public Builder sourceContainerDbCredentials(
                DatabaseCredentials sourceContainerDbCredentials) {
            this.sourceContainerDbCredentials = sourceContainerDbCredentials;
            this.__explicitlySet__.add("sourceContainerDbCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDbCredentials")
        private DatabaseCredentials targetDbCredentials;

        public Builder targetDbCredentials(DatabaseCredentials targetDbCredentials) {
            this.targetDbCredentials = targetDbCredentials;
            this.__explicitlySet__.add("targetDbCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("settings")
        private UpdateGoldenGateSettings settings;

        public Builder settings(UpdateGoldenGateSettings settings) {
            this.settings = settings;
            this.__explicitlySet__.add("settings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateGoldenGateServiceDetails build() {
            UpdateGoldenGateServiceDetails model =
                    new UpdateGoldenGateServiceDetails(
                            this.sourceDbCredentials,
                            this.sourceContainerDbCredentials,
                            this.targetDbCredentials,
                            this.settings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGoldenGateServiceDetails model) {
            if (model.wasPropertyExplicitlySet("sourceDbCredentials")) {
                this.sourceDbCredentials(model.getSourceDbCredentials());
            }
            if (model.wasPropertyExplicitlySet("sourceContainerDbCredentials")) {
                this.sourceContainerDbCredentials(model.getSourceContainerDbCredentials());
            }
            if (model.wasPropertyExplicitlySet("targetDbCredentials")) {
                this.targetDbCredentials(model.getTargetDbCredentials());
            }
            if (model.wasPropertyExplicitlySet("settings")) {
                this.settings(model.getSettings());
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

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDbCredentials")
    private final DatabaseCredentials sourceDbCredentials;

    public DatabaseCredentials getSourceDbCredentials() {
        return sourceDbCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbCredentials")
    private final DatabaseCredentials sourceContainerDbCredentials;

    public DatabaseCredentials getSourceContainerDbCredentials() {
        return sourceContainerDbCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetDbCredentials")
    private final DatabaseCredentials targetDbCredentials;

    public DatabaseCredentials getTargetDbCredentials() {
        return targetDbCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("settings")
    private final UpdateGoldenGateSettings settings;

    public UpdateGoldenGateSettings getSettings() {
        return settings;
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
        sb.append("UpdateGoldenGateServiceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceDbCredentials=").append(String.valueOf(this.sourceDbCredentials));
        sb.append(", sourceContainerDbCredentials=")
                .append(String.valueOf(this.sourceContainerDbCredentials));
        sb.append(", targetDbCredentials=").append(String.valueOf(this.targetDbCredentials));
        sb.append(", settings=").append(String.valueOf(this.settings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateGoldenGateServiceDetails)) {
            return false;
        }

        UpdateGoldenGateServiceDetails other = (UpdateGoldenGateServiceDetails) o;
        return java.util.Objects.equals(this.sourceDbCredentials, other.sourceDbCredentials)
                && java.util.Objects.equals(
                        this.sourceContainerDbCredentials, other.sourceContainerDbCredentials)
                && java.util.Objects.equals(this.targetDbCredentials, other.targetDbCredentials)
                && java.util.Objects.equals(this.settings, other.settings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceDbCredentials == null
                                ? 43
                                : this.sourceDbCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceContainerDbCredentials == null
                                ? 43
                                : this.sourceContainerDbCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDbCredentials == null
                                ? 43
                                : this.targetDbCredentials.hashCode());
        result = (result * PRIME) + (this.settings == null ? 43 : this.settings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
