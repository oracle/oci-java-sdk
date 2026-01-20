/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The information of a backup for the server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Backup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "managedInstanceId",
        "backupLocation",
        "contentType",
        "timeCreated"
    })
    public Backup(
            String id,
            BackupType type,
            String managedInstanceId,
            String backupLocation,
            BackupContentType contentType,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.type = type;
        this.managedInstanceId = managedInstanceId;
        this.backupLocation = backupLocation;
        this.contentType = contentType;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the backup.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier of the backup.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The type of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BackupType type;

        /**
         * The type of the backup.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(BackupType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The managed instance ID of the server for which the backup was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The managed instance ID of the server for which the backup was created.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The location of the backup. For backups of type LOCAL_FILE this is the absolute path of
         * the backup file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupLocation")
        private String backupLocation;

        /**
         * The location of the backup. For backups of type LOCAL_FILE this is the absolute path of
         * the backup file.
         *
         * @param backupLocation the value to set
         * @return this builder
         */
        public Builder backupLocation(String backupLocation) {
            this.backupLocation = backupLocation;
            this.__explicitlySet__.add("backupLocation");
            return this;
        }
        /** The type of content of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private BackupContentType contentType;

        /**
         * The type of content of the backup.
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(BackupContentType contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /**
         * The date and time when the backup was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the backup was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Backup build() {
            Backup model =
                    new Backup(
                            this.id,
                            this.type,
                            this.managedInstanceId,
                            this.backupLocation,
                            this.contentType,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Backup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("backupLocation")) {
                this.backupLocation(model.getBackupLocation());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /**
     * The unique identifier of the backup.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier of the backup.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The type of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final BackupType type;

    /**
     * The type of the backup.
     *
     * @return the value
     */
    public BackupType getType() {
        return type;
    }

    /** The managed instance ID of the server for which the backup was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The managed instance ID of the server for which the backup was created.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The location of the backup. For backups of type LOCAL_FILE this is the absolute path of the
     * backup file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupLocation")
    private final String backupLocation;

    /**
     * The location of the backup. For backups of type LOCAL_FILE this is the absolute path of the
     * backup file.
     *
     * @return the value
     */
    public String getBackupLocation() {
        return backupLocation;
    }

    /** The type of content of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final BackupContentType contentType;

    /**
     * The type of content of the backup.
     *
     * @return the value
     */
    public BackupContentType getContentType() {
        return contentType;
    }

    /**
     * The date and time when the backup was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the backup was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("Backup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", backupLocation=").append(String.valueOf(this.backupLocation));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Backup)) {
            return false;
        }

        Backup other = (Backup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.backupLocation, other.backupLocation)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupLocation == null ? 43 : this.backupLocation.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
