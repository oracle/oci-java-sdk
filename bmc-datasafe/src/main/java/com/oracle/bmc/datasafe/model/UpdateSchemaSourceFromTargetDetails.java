/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of the target database that's used as the source of subsetting schemas <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSchemaSourceFromTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "schemaSource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSchemaSourceFromTargetDetails extends UpdateSchemaSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target database that's used as the source of subsetting schemas */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database that's used as the source of subsetting schemas
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The schemas to be subsetted */
        @com.fasterxml.jackson.annotation.JsonProperty("schemasForSubsetting")
        private java.util.List<String> schemasForSubsetting;

        /**
         * The schemas to be subsetted
         *
         * @param schemasForSubsetting the value to set
         * @return this builder
         */
        public Builder schemasForSubsetting(java.util.List<String> schemasForSubsetting) {
            this.schemasForSubsetting = schemasForSubsetting;
            this.__explicitlySet__.add("schemasForSubsetting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSchemaSourceFromTargetDetails build() {
            UpdateSchemaSourceFromTargetDetails model =
                    new UpdateSchemaSourceFromTargetDetails(
                            this.targetId, this.schemasForSubsetting);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSchemaSourceFromTargetDetails model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("schemasForSubsetting")) {
                this.schemasForSubsetting(model.getSchemasForSubsetting());
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
    public UpdateSchemaSourceFromTargetDetails(
            String targetId, java.util.List<String> schemasForSubsetting) {
        super();
        this.targetId = targetId;
        this.schemasForSubsetting = schemasForSubsetting;
    }

    /** The OCID of the target database that's used as the source of subsetting schemas */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database that's used as the source of subsetting schemas
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The schemas to be subsetted */
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForSubsetting")
    private final java.util.List<String> schemasForSubsetting;

    /**
     * The schemas to be subsetted
     *
     * @return the value
     */
    public java.util.List<String> getSchemasForSubsetting() {
        return schemasForSubsetting;
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
        sb.append("UpdateSchemaSourceFromTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", schemasForSubsetting=").append(String.valueOf(this.schemasForSubsetting));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSchemaSourceFromTargetDetails)) {
            return false;
        }

        UpdateSchemaSourceFromTargetDetails other = (UpdateSchemaSourceFromTargetDetails) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.schemasForSubsetting, other.schemasForSubsetting)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.schemasForSubsetting == null
                                ? 43
                                : this.schemasForSubsetting.hashCode());
        return result;
    }
}
