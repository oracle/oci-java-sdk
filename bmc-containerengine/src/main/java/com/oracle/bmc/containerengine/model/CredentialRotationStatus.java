/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Information regarding cluster's credential rotation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CredentialRotationStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CredentialRotationStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeAutoCompletionScheduled", "status", "statusDetails"})
    public CredentialRotationStatus(
            java.util.Date timeAutoCompletionScheduled,
            Status status,
            StatusDetails statusDetails) {
        super();
        this.timeAutoCompletionScheduled = timeAutoCompletionScheduled;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The time by which retirement of old credentials should start. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAutoCompletionScheduled")
        private java.util.Date timeAutoCompletionScheduled;

        /**
         * The time by which retirement of old credentials should start.
         *
         * @param timeAutoCompletionScheduled the value to set
         * @return this builder
         */
        public Builder timeAutoCompletionScheduled(java.util.Date timeAutoCompletionScheduled) {
            this.timeAutoCompletionScheduled = timeAutoCompletionScheduled;
            this.__explicitlySet__.add("timeAutoCompletionScheduled");
            return this;
        }
        /**
         * Credential rotation status of a kubernetes cluster IN_PROGRESS: Issuing new credentials
         * to kubernetes cluster control plane and worker nodes or retiring old credentials from
         * kubernetes cluster control plane and worker nodes. WAITING: Waiting for customer to
         * invoke the complete rotation action or the automcatic complete rotation action.
         * COMPLETED: New credentials are functional on kuberentes cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Credential rotation status of a kubernetes cluster IN_PROGRESS: Issuing new credentials
         * to kubernetes cluster control plane and worker nodes or retiring old credentials from
         * kubernetes cluster control plane and worker nodes. WAITING: Waiting for customer to
         * invoke the complete rotation action or the automcatic complete rotation action.
         * COMPLETED: New credentials are functional on kuberentes cluster.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Details of a kuberenetes cluster credential rotation status: ISSUING_NEW_CREDENTIALS:
         * Credential rotation is in progress. Starting to issue new credentials to kubernetes
         * cluster control plane and worker nodes. NEW_CREDENTIALS_ISSUED: New credentials are
         * added. At this stage cluster has both old and new credentials and is awaiting old
         * credentials retirement. RETIRING_OLD_CREDENTIALS: Retirement of old credentials is in
         * progress. Starting to remove old credentials from kubernetes cluster control plane and
         * worker nodes. COMPLETED: Credential rotation is complete. Old credentials are retired.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private StatusDetails statusDetails;

        /**
         * Details of a kuberenetes cluster credential rotation status: ISSUING_NEW_CREDENTIALS:
         * Credential rotation is in progress. Starting to issue new credentials to kubernetes
         * cluster control plane and worker nodes. NEW_CREDENTIALS_ISSUED: New credentials are
         * added. At this stage cluster has both old and new credentials and is awaiting old
         * credentials retirement. RETIRING_OLD_CREDENTIALS: Retirement of old credentials is in
         * progress. Starting to remove old credentials from kubernetes cluster control plane and
         * worker nodes. COMPLETED: Credential rotation is complete. Old credentials are retired.
         *
         * @param statusDetails the value to set
         * @return this builder
         */
        public Builder statusDetails(StatusDetails statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CredentialRotationStatus build() {
            CredentialRotationStatus model =
                    new CredentialRotationStatus(
                            this.timeAutoCompletionScheduled, this.status, this.statusDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialRotationStatus model) {
            if (model.wasPropertyExplicitlySet("timeAutoCompletionScheduled")) {
                this.timeAutoCompletionScheduled(model.getTimeAutoCompletionScheduled());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDetails")) {
                this.statusDetails(model.getStatusDetails());
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

    /** The time by which retirement of old credentials should start. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAutoCompletionScheduled")
    private final java.util.Date timeAutoCompletionScheduled;

    /**
     * The time by which retirement of old credentials should start.
     *
     * @return the value
     */
    public java.util.Date getTimeAutoCompletionScheduled() {
        return timeAutoCompletionScheduled;
    }

    /**
     * Credential rotation status of a kubernetes cluster IN_PROGRESS: Issuing new credentials to
     * kubernetes cluster control plane and worker nodes or retiring old credentials from kubernetes
     * cluster control plane and worker nodes. WAITING: Waiting for customer to invoke the complete
     * rotation action or the automcatic complete rotation action. COMPLETED: New credentials are
     * functional on kuberentes cluster.
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Waiting("WAITING"),
        Completed("COMPLETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Credential rotation status of a kubernetes cluster IN_PROGRESS: Issuing new credentials to
     * kubernetes cluster control plane and worker nodes or retiring old credentials from kubernetes
     * cluster control plane and worker nodes. WAITING: Waiting for customer to invoke the complete
     * rotation action or the automcatic complete rotation action. COMPLETED: New credentials are
     * functional on kuberentes cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Credential rotation status of a kubernetes cluster IN_PROGRESS: Issuing new credentials to
     * kubernetes cluster control plane and worker nodes or retiring old credentials from kubernetes
     * cluster control plane and worker nodes. WAITING: Waiting for customer to invoke the complete
     * rotation action or the automcatic complete rotation action. COMPLETED: New credentials are
     * functional on kuberentes cluster.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Details of a kuberenetes cluster credential rotation status: ISSUING_NEW_CREDENTIALS:
     * Credential rotation is in progress. Starting to issue new credentials to kubernetes cluster
     * control plane and worker nodes. NEW_CREDENTIALS_ISSUED: New credentials are added. At this
     * stage cluster has both old and new credentials and is awaiting old credentials retirement.
     * RETIRING_OLD_CREDENTIALS: Retirement of old credentials is in progress. Starting to remove
     * old credentials from kubernetes cluster control plane and worker nodes. COMPLETED: Credential
     * rotation is complete. Old credentials are retired.
     */
    public enum StatusDetails implements com.oracle.bmc.http.internal.BmcEnum {
        IssuingNewCredentials("ISSUING_NEW_CREDENTIALS"),
        NewCredentialsIssued("NEW_CREDENTIALS_ISSUED"),
        RetiringOldCredentials("RETIRING_OLD_CREDENTIALS"),
        Completed("COMPLETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StatusDetails.class);

        private final String value;
        private static java.util.Map<String, StatusDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (StatusDetails v : StatusDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StatusDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StatusDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StatusDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Details of a kuberenetes cluster credential rotation status: ISSUING_NEW_CREDENTIALS:
     * Credential rotation is in progress. Starting to issue new credentials to kubernetes cluster
     * control plane and worker nodes. NEW_CREDENTIALS_ISSUED: New credentials are added. At this
     * stage cluster has both old and new credentials and is awaiting old credentials retirement.
     * RETIRING_OLD_CREDENTIALS: Retirement of old credentials is in progress. Starting to remove
     * old credentials from kubernetes cluster control plane and worker nodes. COMPLETED: Credential
     * rotation is complete. Old credentials are retired.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final StatusDetails statusDetails;

    /**
     * Details of a kuberenetes cluster credential rotation status: ISSUING_NEW_CREDENTIALS:
     * Credential rotation is in progress. Starting to issue new credentials to kubernetes cluster
     * control plane and worker nodes. NEW_CREDENTIALS_ISSUED: New credentials are added. At this
     * stage cluster has both old and new credentials and is awaiting old credentials retirement.
     * RETIRING_OLD_CREDENTIALS: Retirement of old credentials is in progress. Starting to remove
     * old credentials from kubernetes cluster control plane and worker nodes. COMPLETED: Credential
     * rotation is complete. Old credentials are retired.
     *
     * @return the value
     */
    public StatusDetails getStatusDetails() {
        return statusDetails;
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
        sb.append("CredentialRotationStatus(");
        sb.append("super=").append(super.toString());
        sb.append("timeAutoCompletionScheduled=")
                .append(String.valueOf(this.timeAutoCompletionScheduled));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialRotationStatus)) {
            return false;
        }

        CredentialRotationStatus other = (CredentialRotationStatus) o;
        return java.util.Objects.equals(
                        this.timeAutoCompletionScheduled, other.timeAutoCompletionScheduled)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeAutoCompletionScheduled == null
                                ? 43
                                : this.timeAutoCompletionScheduled.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
