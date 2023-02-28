/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration tablespace settings valid for ADB-D target type using remap target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateADBDedicatedRemapTargetTablespaceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateADBDedicatedRemapTargetTablespaceDetails
        extends UpdateTargetTypeTablespaceDetails {
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

        public UpdateADBDedicatedRemapTargetTablespaceDetails build() {
            UpdateADBDedicatedRemapTargetTablespaceDetails model =
                    new UpdateADBDedicatedRemapTargetTablespaceDetails(this.remapTarget);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateADBDedicatedRemapTargetTablespaceDetails model) {
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
    public UpdateADBDedicatedRemapTargetTablespaceDetails(String remapTarget) {
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
        sb.append("UpdateADBDedicatedRemapTargetTablespaceDetails(");
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
        if (!(o instanceof UpdateADBDedicatedRemapTargetTablespaceDetails)) {
            return false;
        }

        UpdateADBDedicatedRemapTargetTablespaceDetails other =
                (UpdateADBDedicatedRemapTargetTablespaceDetails) o;
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
