/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration tablespace settings valid for NON-ADB target type using remap feature. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateNonADBRemapTablespaceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateNonADBRemapTablespaceDetails extends CreateTargetTypeTablespaceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of tablespace at target to which the source database tablespace need to be remapped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remapTarget")
        private String remapTarget;

        /**
         * Name of tablespace at target to which the source database tablespace need to be remapped.
         *
         * @param remapTarget the value to set
         * @return this builder
         */
        public Builder remapTarget(String remapTarget) {
            this.remapTarget = remapTarget;
            this.__explicitlySet__.add("remapTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNonADBRemapTablespaceDetails build() {
            CreateNonADBRemapTablespaceDetails model =
                    new CreateNonADBRemapTablespaceDetails(this.remapTarget);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNonADBRemapTablespaceDetails model) {
            if (model.wasPropertyExplicitlySet("remapTarget")) {
                this.remapTarget(model.getRemapTarget());
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
    public CreateNonADBRemapTablespaceDetails(String remapTarget) {
        super();
        this.remapTarget = remapTarget;
    }

    /** Name of tablespace at target to which the source database tablespace need to be remapped. */
    @com.fasterxml.jackson.annotation.JsonProperty("remapTarget")
    private final String remapTarget;

    /**
     * Name of tablespace at target to which the source database tablespace need to be remapped.
     *
     * @return the value
     */
    public String getRemapTarget() {
        return remapTarget;
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
        sb.append("CreateNonADBRemapTablespaceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", remapTarget=").append(String.valueOf(this.remapTarget));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNonADBRemapTablespaceDetails)) {
            return false;
        }

        CreateNonADBRemapTablespaceDetails other = (CreateNonADBRemapTablespaceDetails) o;
        return java.util.Objects.equals(this.remapTarget, other.remapTarget) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.remapTarget == null ? 43 : this.remapTarget.hashCode());
        return result;
    }
}
