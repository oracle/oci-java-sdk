/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define meta data for a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterMetadata extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeCreated",
        "createdByUserId",
        "createdByWorkRequestId",
        "timeDeleted",
        "deletedByUserId",
        "deletedByWorkRequestId",
        "timeUpdated",
        "updatedByUserId",
        "updatedByWorkRequestId"
    })
    public ClusterMetadata(
            java.util.Date timeCreated,
            String createdByUserId,
            String createdByWorkRequestId,
            java.util.Date timeDeleted,
            String deletedByUserId,
            String deletedByWorkRequestId,
            java.util.Date timeUpdated,
            String updatedByUserId,
            String updatedByWorkRequestId) {
        super();
        this.timeCreated = timeCreated;
        this.createdByUserId = createdByUserId;
        this.createdByWorkRequestId = createdByWorkRequestId;
        this.timeDeleted = timeDeleted;
        this.deletedByUserId = deletedByUserId;
        this.deletedByWorkRequestId = deletedByWorkRequestId;
        this.timeUpdated = timeUpdated;
        this.updatedByUserId = updatedByUserId;
        this.updatedByWorkRequestId = updatedByWorkRequestId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time the cluster was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the cluster was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The user who created the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
        private String createdByUserId;

        /**
         * The user who created the cluster.
         * @param createdByUserId the value to set
         * @return this builder
         **/
        public Builder createdByUserId(String createdByUserId) {
            this.createdByUserId = createdByUserId;
            this.__explicitlySet__.add("createdByUserId");
            return this;
        }
        /**
         * The OCID of the work request which created the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdByWorkRequestId")
        private String createdByWorkRequestId;

        /**
         * The OCID of the work request which created the cluster.
         * @param createdByWorkRequestId the value to set
         * @return this builder
         **/
        public Builder createdByWorkRequestId(String createdByWorkRequestId) {
            this.createdByWorkRequestId = createdByWorkRequestId;
            this.__explicitlySet__.add("createdByWorkRequestId");
            return this;
        }
        /**
         * The time the cluster was deleted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeleted")
        private java.util.Date timeDeleted;

        /**
         * The time the cluster was deleted.
         * @param timeDeleted the value to set
         * @return this builder
         **/
        public Builder timeDeleted(java.util.Date timeDeleted) {
            this.timeDeleted = timeDeleted;
            this.__explicitlySet__.add("timeDeleted");
            return this;
        }
        /**
         * The user who deleted the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deletedByUserId")
        private String deletedByUserId;

        /**
         * The user who deleted the cluster.
         * @param deletedByUserId the value to set
         * @return this builder
         **/
        public Builder deletedByUserId(String deletedByUserId) {
            this.deletedByUserId = deletedByUserId;
            this.__explicitlySet__.add("deletedByUserId");
            return this;
        }
        /**
         * The OCID of the work request which deleted the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deletedByWorkRequestId")
        private String deletedByWorkRequestId;

        /**
         * The OCID of the work request which deleted the cluster.
         * @param deletedByWorkRequestId the value to set
         * @return this builder
         **/
        public Builder deletedByWorkRequestId(String deletedByWorkRequestId) {
            this.deletedByWorkRequestId = deletedByWorkRequestId;
            this.__explicitlySet__.add("deletedByWorkRequestId");
            return this;
        }
        /**
         * The time the cluster was updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the cluster was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The user who updated the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
        private String updatedByUserId;

        /**
         * The user who updated the cluster.
         * @param updatedByUserId the value to set
         * @return this builder
         **/
        public Builder updatedByUserId(String updatedByUserId) {
            this.updatedByUserId = updatedByUserId;
            this.__explicitlySet__.add("updatedByUserId");
            return this;
        }
        /**
         * The OCID of the work request which updated the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedByWorkRequestId")
        private String updatedByWorkRequestId;

        /**
         * The OCID of the work request which updated the cluster.
         * @param updatedByWorkRequestId the value to set
         * @return this builder
         **/
        public Builder updatedByWorkRequestId(String updatedByWorkRequestId) {
            this.updatedByWorkRequestId = updatedByWorkRequestId;
            this.__explicitlySet__.add("updatedByWorkRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterMetadata build() {
            ClusterMetadata model =
                    new ClusterMetadata(
                            this.timeCreated,
                            this.createdByUserId,
                            this.createdByWorkRequestId,
                            this.timeDeleted,
                            this.deletedByUserId,
                            this.deletedByWorkRequestId,
                            this.timeUpdated,
                            this.updatedByUserId,
                            this.updatedByWorkRequestId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterMetadata model) {
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("createdByUserId")) {
                this.createdByUserId(model.getCreatedByUserId());
            }
            if (model.wasPropertyExplicitlySet("createdByWorkRequestId")) {
                this.createdByWorkRequestId(model.getCreatedByWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("timeDeleted")) {
                this.timeDeleted(model.getTimeDeleted());
            }
            if (model.wasPropertyExplicitlySet("deletedByUserId")) {
                this.deletedByUserId(model.getDeletedByUserId());
            }
            if (model.wasPropertyExplicitlySet("deletedByWorkRequestId")) {
                this.deletedByWorkRequestId(model.getDeletedByWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("updatedByUserId")) {
                this.updatedByUserId(model.getUpdatedByUserId());
            }
            if (model.wasPropertyExplicitlySet("updatedByWorkRequestId")) {
                this.updatedByWorkRequestId(model.getUpdatedByWorkRequestId());
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
     * The time the cluster was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the cluster was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The user who created the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
    private final String createdByUserId;

    /**
     * The user who created the cluster.
     * @return the value
     **/
    public String getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * The OCID of the work request which created the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByWorkRequestId")
    private final String createdByWorkRequestId;

    /**
     * The OCID of the work request which created the cluster.
     * @return the value
     **/
    public String getCreatedByWorkRequestId() {
        return createdByWorkRequestId;
    }

    /**
     * The time the cluster was deleted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeleted")
    private final java.util.Date timeDeleted;

    /**
     * The time the cluster was deleted.
     * @return the value
     **/
    public java.util.Date getTimeDeleted() {
        return timeDeleted;
    }

    /**
     * The user who deleted the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedByUserId")
    private final String deletedByUserId;

    /**
     * The user who deleted the cluster.
     * @return the value
     **/
    public String getDeletedByUserId() {
        return deletedByUserId;
    }

    /**
     * The OCID of the work request which deleted the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedByWorkRequestId")
    private final String deletedByWorkRequestId;

    /**
     * The OCID of the work request which deleted the cluster.
     * @return the value
     **/
    public String getDeletedByWorkRequestId() {
        return deletedByWorkRequestId;
    }

    /**
     * The time the cluster was updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the cluster was updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The user who updated the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
    private final String updatedByUserId;

    /**
     * The user who updated the cluster.
     * @return the value
     **/
    public String getUpdatedByUserId() {
        return updatedByUserId;
    }

    /**
     * The OCID of the work request which updated the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByWorkRequestId")
    private final String updatedByWorkRequestId;

    /**
     * The OCID of the work request which updated the cluster.
     * @return the value
     **/
    public String getUpdatedByWorkRequestId() {
        return updatedByWorkRequestId;
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
        sb.append("ClusterMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdByUserId=").append(String.valueOf(this.createdByUserId));
        sb.append(", createdByWorkRequestId=").append(String.valueOf(this.createdByWorkRequestId));
        sb.append(", timeDeleted=").append(String.valueOf(this.timeDeleted));
        sb.append(", deletedByUserId=").append(String.valueOf(this.deletedByUserId));
        sb.append(", deletedByWorkRequestId=").append(String.valueOf(this.deletedByWorkRequestId));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedByUserId=").append(String.valueOf(this.updatedByUserId));
        sb.append(", updatedByWorkRequestId=").append(String.valueOf(this.updatedByWorkRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterMetadata)) {
            return false;
        }

        ClusterMetadata other = (ClusterMetadata) o;
        return java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdByUserId, other.createdByUserId)
                && java.util.Objects.equals(
                        this.createdByWorkRequestId, other.createdByWorkRequestId)
                && java.util.Objects.equals(this.timeDeleted, other.timeDeleted)
                && java.util.Objects.equals(this.deletedByUserId, other.deletedByUserId)
                && java.util.Objects.equals(
                        this.deletedByWorkRequestId, other.deletedByWorkRequestId)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.updatedByUserId, other.updatedByUserId)
                && java.util.Objects.equals(
                        this.updatedByWorkRequestId, other.updatedByWorkRequestId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.createdByUserId == null ? 43 : this.createdByUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.createdByWorkRequestId == null
                                ? 43
                                : this.createdByWorkRequestId.hashCode());
        result = (result * PRIME) + (this.timeDeleted == null ? 43 : this.timeDeleted.hashCode());
        result =
                (result * PRIME)
                        + (this.deletedByUserId == null ? 43 : this.deletedByUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.deletedByWorkRequestId == null
                                ? 43
                                : this.deletedByWorkRequestId.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedByUserId == null ? 43 : this.updatedByUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedByWorkRequestId == null
                                ? 43
                                : this.updatedByWorkRequestId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
