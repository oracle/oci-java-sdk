/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of copy object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCopyObjectRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCopyObjectRequestDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceWorkspaceId", "objectKeys", "copyConflictResolution"})
    public CreateCopyObjectRequestDetails(
            String sourceWorkspaceId,
            java.util.List<String> objectKeys,
            CopyConflictResolution copyConflictResolution) {
        super();
        this.sourceWorkspaceId = sourceWorkspaceId;
        this.objectKeys = objectKeys;
        this.copyConflictResolution = copyConflictResolution;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The workspace id of the source from where we need to copy object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceWorkspaceId")
        private String sourceWorkspaceId;

        /**
         * The workspace id of the source from where we need to copy object.
         * @param sourceWorkspaceId the value to set
         * @return this builder
         **/
        public Builder sourceWorkspaceId(String sourceWorkspaceId) {
            this.sourceWorkspaceId = sourceWorkspaceId;
            this.__explicitlySet__.add("sourceWorkspaceId");
            return this;
        }
        /**
         * The list of the objects to be copied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
        private java.util.List<String> objectKeys;

        /**
         * The list of the objects to be copied.
         * @param objectKeys the value to set
         * @return this builder
         **/
        public Builder objectKeys(java.util.List<String> objectKeys) {
            this.objectKeys = objectKeys;
            this.__explicitlySet__.add("objectKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("copyConflictResolution")
        private CopyConflictResolution copyConflictResolution;

        public Builder copyConflictResolution(CopyConflictResolution copyConflictResolution) {
            this.copyConflictResolution = copyConflictResolution;
            this.__explicitlySet__.add("copyConflictResolution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCopyObjectRequestDetails build() {
            CreateCopyObjectRequestDetails model =
                    new CreateCopyObjectRequestDetails(
                            this.sourceWorkspaceId, this.objectKeys, this.copyConflictResolution);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCopyObjectRequestDetails model) {
            if (model.wasPropertyExplicitlySet("sourceWorkspaceId")) {
                this.sourceWorkspaceId(model.getSourceWorkspaceId());
            }
            if (model.wasPropertyExplicitlySet("objectKeys")) {
                this.objectKeys(model.getObjectKeys());
            }
            if (model.wasPropertyExplicitlySet("copyConflictResolution")) {
                this.copyConflictResolution(model.getCopyConflictResolution());
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
     * The workspace id of the source from where we need to copy object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceWorkspaceId")
    private final String sourceWorkspaceId;

    /**
     * The workspace id of the source from where we need to copy object.
     * @return the value
     **/
    public String getSourceWorkspaceId() {
        return sourceWorkspaceId;
    }

    /**
     * The list of the objects to be copied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
    private final java.util.List<String> objectKeys;

    /**
     * The list of the objects to be copied.
     * @return the value
     **/
    public java.util.List<String> getObjectKeys() {
        return objectKeys;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("copyConflictResolution")
    private final CopyConflictResolution copyConflictResolution;

    public CopyConflictResolution getCopyConflictResolution() {
        return copyConflictResolution;
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
        sb.append("CreateCopyObjectRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceWorkspaceId=").append(String.valueOf(this.sourceWorkspaceId));
        sb.append(", objectKeys=").append(String.valueOf(this.objectKeys));
        sb.append(", copyConflictResolution=").append(String.valueOf(this.copyConflictResolution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCopyObjectRequestDetails)) {
            return false;
        }

        CreateCopyObjectRequestDetails other = (CreateCopyObjectRequestDetails) o;
        return java.util.Objects.equals(this.sourceWorkspaceId, other.sourceWorkspaceId)
                && java.util.Objects.equals(this.objectKeys, other.objectKeys)
                && java.util.Objects.equals(
                        this.copyConflictResolution, other.copyConflictResolution)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceWorkspaceId == null ? 43 : this.sourceWorkspaceId.hashCode());
        result = (result * PRIME) + (this.objectKeys == null ? 43 : this.objectKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.copyConflictResolution == null
                                ? 43
                                : this.copyConflictResolution.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
