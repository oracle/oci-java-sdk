/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the application.
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
    builder = SourceApplicationInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SourceApplicationInfo
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "workspaceId",
        "applicationKey",
        "applicationVersion",
        "lastPatchKey"
    })
    public SourceApplicationInfo(
            String workspaceId,
            String applicationKey,
            String applicationVersion,
            String lastPatchKey) {
        super();
        this.workspaceId = workspaceId;
        this.applicationKey = applicationKey;
        this.applicationVersion = applicationVersion;
        this.lastPatchKey = lastPatchKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the workspace containing the application. This allows cross workspace deployment to publish an application from a different workspace into the current workspace specified in this operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
        private String workspaceId;

        /**
         * The OCID of the workspace containing the application. This allows cross workspace deployment to publish an application from a different workspace into the current workspace specified in this operation.
         * @param workspaceId the value to set
         * @return this builder
         **/
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            this.__explicitlySet__.add("workspaceId");
            return this;
        }
        /**
         * The source application key to use when creating the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * The source application key to use when creating the application.
         * @param applicationKey the value to set
         * @return this builder
         **/
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /**
         * The source application version of the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
        private String applicationVersion;

        /**
         * The source application version of the application.
         * @param applicationVersion the value to set
         * @return this builder
         **/
        public Builder applicationVersion(String applicationVersion) {
            this.applicationVersion = applicationVersion;
            this.__explicitlySet__.add("applicationVersion");
            return this;
        }
        /**
         * The last patch key for the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastPatchKey")
        private String lastPatchKey;

        /**
         * The last patch key for the application.
         * @param lastPatchKey the value to set
         * @return this builder
         **/
        public Builder lastPatchKey(String lastPatchKey) {
            this.lastPatchKey = lastPatchKey;
            this.__explicitlySet__.add("lastPatchKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceApplicationInfo build() {
            SourceApplicationInfo model =
                    new SourceApplicationInfo(
                            this.workspaceId,
                            this.applicationKey,
                            this.applicationVersion,
                            this.lastPatchKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceApplicationInfo model) {
            if (model.wasPropertyExplicitlySet("workspaceId")) {
                this.workspaceId(model.getWorkspaceId());
            }
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationVersion")) {
                this.applicationVersion(model.getApplicationVersion());
            }
            if (model.wasPropertyExplicitlySet("lastPatchKey")) {
                this.lastPatchKey(model.getLastPatchKey());
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
     * The OCID of the workspace containing the application. This allows cross workspace deployment to publish an application from a different workspace into the current workspace specified in this operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
    private final String workspaceId;

    /**
     * The OCID of the workspace containing the application. This allows cross workspace deployment to publish an application from a different workspace into the current workspace specified in this operation.
     * @return the value
     **/
    public String getWorkspaceId() {
        return workspaceId;
    }

    /**
     * The source application key to use when creating the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * The source application key to use when creating the application.
     * @return the value
     **/
    public String getApplicationKey() {
        return applicationKey;
    }

    /**
     * The source application version of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
    private final String applicationVersion;

    /**
     * The source application version of the application.
     * @return the value
     **/
    public String getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * The last patch key for the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastPatchKey")
    private final String lastPatchKey;

    /**
     * The last patch key for the application.
     * @return the value
     **/
    public String getLastPatchKey() {
        return lastPatchKey;
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
        sb.append("SourceApplicationInfo(");
        sb.append("super=").append(super.toString());
        sb.append("workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(", applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", applicationVersion=").append(String.valueOf(this.applicationVersion));
        sb.append(", lastPatchKey=").append(String.valueOf(this.lastPatchKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceApplicationInfo)) {
            return false;
        }

        SourceApplicationInfo other = (SourceApplicationInfo) o;
        return java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.applicationVersion, other.applicationVersion)
                && java.util.Objects.equals(this.lastPatchKey, other.lastPatchKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationVersion == null
                                ? 43
                                : this.applicationVersion.hashCode());
        result = (result * PRIME) + (this.lastPatchKey == null ? 43 : this.lastPatchKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
