/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details for modifying the Operator Control assignment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOperatorControlAssignmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOperatorControlAssignmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeAssignmentFrom",
        "timeAssignmentTo",
        "isEnforcedAlways",
        "comment",
        "isLogForwarded",
        "remoteSyslogServerAddress",
        "remoteSyslogServerPort",
        "remoteSyslogServerCACert",
        "isAutoApproveDuringMaintenance",
        "freeformTags",
        "definedTags"
    })
    public UpdateOperatorControlAssignmentDetails(
            java.util.Date timeAssignmentFrom,
            java.util.Date timeAssignmentTo,
            Boolean isEnforcedAlways,
            String comment,
            Boolean isLogForwarded,
            String remoteSyslogServerAddress,
            Integer remoteSyslogServerPort,
            String remoteSyslogServerCACert,
            Boolean isAutoApproveDuringMaintenance,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.timeAssignmentFrom = timeAssignmentFrom;
        this.timeAssignmentTo = timeAssignmentTo;
        this.isEnforcedAlways = isEnforcedAlways;
        this.comment = comment;
        this.isLogForwarded = isLogForwarded;
        this.remoteSyslogServerAddress = remoteSyslogServerAddress;
        this.remoteSyslogServerPort = remoteSyslogServerPort;
        this.remoteSyslogServerCACert = remoteSyslogServerCACert;
        this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time at which the target resource will be brought under the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
        private java.util.Date timeAssignmentFrom;

        /**
         * The time at which the target resource will be brought under the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeAssignmentFrom the value to set
         * @return this builder
         **/
        public Builder timeAssignmentFrom(java.util.Date timeAssignmentFrom) {
            this.timeAssignmentFrom = timeAssignmentFrom;
            this.__explicitlySet__.add("timeAssignmentFrom");
            return this;
        }
        /**
         * The time at which the target resource will leave the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
        private java.util.Date timeAssignmentTo;

        /**
         * The time at which the target resource will leave the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeAssignmentTo the value to set
         * @return this builder
         **/
        public Builder timeAssignmentTo(java.util.Date timeAssignmentTo) {
            this.timeAssignmentTo = timeAssignmentTo;
            this.__explicitlySet__.add("timeAssignmentTo");
            return this;
        }
        /**
         * If true, then the target resource is always governed by the operator control. Otherwise governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
        private Boolean isEnforcedAlways;

        /**
         * If true, then the target resource is always governed by the operator control. Otherwise governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
         * @param isEnforcedAlways the value to set
         * @return this builder
         **/
        public Builder isEnforcedAlways(Boolean isEnforcedAlways) {
            this.isEnforcedAlways = isEnforcedAlways;
            this.__explicitlySet__.add("isEnforcedAlways");
            return this;
        }
        /**
         * Comment about the modification of the operator control assignment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Comment about the modification of the operator control assignment.
         * @param comment the value to set
         * @return this builder
         **/
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /**
         * If set, then the audit logs will be forwarded to the relevant remote logging server
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
        private Boolean isLogForwarded;

        /**
         * If set, then the audit logs will be forwarded to the relevant remote logging server
         * @param isLogForwarded the value to set
         * @return this builder
         **/
        public Builder isLogForwarded(Boolean isLogForwarded) {
            this.isLogForwarded = isLogForwarded;
            this.__explicitlySet__.add("isLogForwarded");
            return this;
        }
        /**
         * The address of the remote syslog server where the audit logs will be forwarded to. Address in host or IP format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
        private String remoteSyslogServerAddress;

        /**
         * The address of the remote syslog server where the audit logs will be forwarded to. Address in host or IP format.
         * @param remoteSyslogServerAddress the value to set
         * @return this builder
         **/
        public Builder remoteSyslogServerAddress(String remoteSyslogServerAddress) {
            this.remoteSyslogServerAddress = remoteSyslogServerAddress;
            this.__explicitlySet__.add("remoteSyslogServerAddress");
            return this;
        }
        /**
         * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
        private Integer remoteSyslogServerPort;

        /**
         * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
         * @param remoteSyslogServerPort the value to set
         * @return this builder
         **/
        public Builder remoteSyslogServerPort(Integer remoteSyslogServerPort) {
            this.remoteSyslogServerPort = remoteSyslogServerPort;
            this.__explicitlySet__.add("remoteSyslogServerPort");
            return this;
        }
        /**
         * The CA certificate of the remote syslog server. Identity of the remote syslog server will be asserted based on this certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
        private String remoteSyslogServerCACert;

        /**
         * The CA certificate of the remote syslog server. Identity of the remote syslog server will be asserted based on this certificate.
         * @param remoteSyslogServerCACert the value to set
         * @return this builder
         **/
        public Builder remoteSyslogServerCACert(String remoteSyslogServerCACert) {
            this.remoteSyslogServerCACert = remoteSyslogServerCACert;
            this.__explicitlySet__.add("remoteSyslogServerCACert");
            return this;
        }
        /**
         * The boolean if true would autoApprove during maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
        private Boolean isAutoApproveDuringMaintenance;

        /**
         * The boolean if true would autoApprove during maintenance.
         * @param isAutoApproveDuringMaintenance the value to set
         * @return this builder
         **/
        public Builder isAutoApproveDuringMaintenance(Boolean isAutoApproveDuringMaintenance) {
            this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
            this.__explicitlySet__.add("isAutoApproveDuringMaintenance");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOperatorControlAssignmentDetails build() {
            UpdateOperatorControlAssignmentDetails model =
                    new UpdateOperatorControlAssignmentDetails(
                            this.timeAssignmentFrom,
                            this.timeAssignmentTo,
                            this.isEnforcedAlways,
                            this.comment,
                            this.isLogForwarded,
                            this.remoteSyslogServerAddress,
                            this.remoteSyslogServerPort,
                            this.remoteSyslogServerCACert,
                            this.isAutoApproveDuringMaintenance,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOperatorControlAssignmentDetails model) {
            if (model.wasPropertyExplicitlySet("timeAssignmentFrom")) {
                this.timeAssignmentFrom(model.getTimeAssignmentFrom());
            }
            if (model.wasPropertyExplicitlySet("timeAssignmentTo")) {
                this.timeAssignmentTo(model.getTimeAssignmentTo());
            }
            if (model.wasPropertyExplicitlySet("isEnforcedAlways")) {
                this.isEnforcedAlways(model.getIsEnforcedAlways());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("isLogForwarded")) {
                this.isLogForwarded(model.getIsLogForwarded());
            }
            if (model.wasPropertyExplicitlySet("remoteSyslogServerAddress")) {
                this.remoteSyslogServerAddress(model.getRemoteSyslogServerAddress());
            }
            if (model.wasPropertyExplicitlySet("remoteSyslogServerPort")) {
                this.remoteSyslogServerPort(model.getRemoteSyslogServerPort());
            }
            if (model.wasPropertyExplicitlySet("remoteSyslogServerCACert")) {
                this.remoteSyslogServerCACert(model.getRemoteSyslogServerCACert());
            }
            if (model.wasPropertyExplicitlySet("isAutoApproveDuringMaintenance")) {
                this.isAutoApproveDuringMaintenance(model.getIsAutoApproveDuringMaintenance());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The time at which the target resource will be brought under the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
    private final java.util.Date timeAssignmentFrom;

    /**
     * The time at which the target resource will be brought under the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeAssignmentFrom() {
        return timeAssignmentFrom;
    }

    /**
     * The time at which the target resource will leave the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
    private final java.util.Date timeAssignmentTo;

    /**
     * The time at which the target resource will leave the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeAssignmentTo() {
        return timeAssignmentTo;
    }

    /**
     * If true, then the target resource is always governed by the operator control. Otherwise governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
    private final Boolean isEnforcedAlways;

    /**
     * If true, then the target resource is always governed by the operator control. Otherwise governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
     * @return the value
     **/
    public Boolean getIsEnforcedAlways() {
        return isEnforcedAlways;
    }

    /**
     * Comment about the modification of the operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Comment about the modification of the operator control assignment.
     * @return the value
     **/
    public String getComment() {
        return comment;
    }

    /**
     * If set, then the audit logs will be forwarded to the relevant remote logging server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
    private final Boolean isLogForwarded;

    /**
     * If set, then the audit logs will be forwarded to the relevant remote logging server
     * @return the value
     **/
    public Boolean getIsLogForwarded() {
        return isLogForwarded;
    }

    /**
     * The address of the remote syslog server where the audit logs will be forwarded to. Address in host or IP format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
    private final String remoteSyslogServerAddress;

    /**
     * The address of the remote syslog server where the audit logs will be forwarded to. Address in host or IP format.
     * @return the value
     **/
    public String getRemoteSyslogServerAddress() {
        return remoteSyslogServerAddress;
    }

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
    private final Integer remoteSyslogServerPort;

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
     * @return the value
     **/
    public Integer getRemoteSyslogServerPort() {
        return remoteSyslogServerPort;
    }

    /**
     * The CA certificate of the remote syslog server. Identity of the remote syslog server will be asserted based on this certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
    private final String remoteSyslogServerCACert;

    /**
     * The CA certificate of the remote syslog server. Identity of the remote syslog server will be asserted based on this certificate.
     * @return the value
     **/
    public String getRemoteSyslogServerCACert() {
        return remoteSyslogServerCACert;
    }

    /**
     * The boolean if true would autoApprove during maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
    private final Boolean isAutoApproveDuringMaintenance;

    /**
     * The boolean if true would autoApprove during maintenance.
     * @return the value
     **/
    public Boolean getIsAutoApproveDuringMaintenance() {
        return isAutoApproveDuringMaintenance;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateOperatorControlAssignmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeAssignmentFrom=").append(String.valueOf(this.timeAssignmentFrom));
        sb.append(", timeAssignmentTo=").append(String.valueOf(this.timeAssignmentTo));
        sb.append(", isEnforcedAlways=").append(String.valueOf(this.isEnforcedAlways));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", isLogForwarded=").append(String.valueOf(this.isLogForwarded));
        sb.append(", remoteSyslogServerAddress=")
                .append(String.valueOf(this.remoteSyslogServerAddress));
        sb.append(", remoteSyslogServerPort=").append(String.valueOf(this.remoteSyslogServerPort));
        sb.append(", remoteSyslogServerCACert=")
                .append(String.valueOf(this.remoteSyslogServerCACert));
        sb.append(", isAutoApproveDuringMaintenance=")
                .append(String.valueOf(this.isAutoApproveDuringMaintenance));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOperatorControlAssignmentDetails)) {
            return false;
        }

        UpdateOperatorControlAssignmentDetails other = (UpdateOperatorControlAssignmentDetails) o;
        return java.util.Objects.equals(this.timeAssignmentFrom, other.timeAssignmentFrom)
                && java.util.Objects.equals(this.timeAssignmentTo, other.timeAssignmentTo)
                && java.util.Objects.equals(this.isEnforcedAlways, other.isEnforcedAlways)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.isLogForwarded, other.isLogForwarded)
                && java.util.Objects.equals(
                        this.remoteSyslogServerAddress, other.remoteSyslogServerAddress)
                && java.util.Objects.equals(
                        this.remoteSyslogServerPort, other.remoteSyslogServerPort)
                && java.util.Objects.equals(
                        this.remoteSyslogServerCACert, other.remoteSyslogServerCACert)
                && java.util.Objects.equals(
                        this.isAutoApproveDuringMaintenance, other.isAutoApproveDuringMaintenance)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeAssignmentFrom == null
                                ? 43
                                : this.timeAssignmentFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAssignmentTo == null ? 43 : this.timeAssignmentTo.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnforcedAlways == null ? 43 : this.isEnforcedAlways.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result =
                (result * PRIME)
                        + (this.isLogForwarded == null ? 43 : this.isLogForwarded.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteSyslogServerAddress == null
                                ? 43
                                : this.remoteSyslogServerAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteSyslogServerPort == null
                                ? 43
                                : this.remoteSyslogServerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteSyslogServerCACert == null
                                ? 43
                                : this.remoteSyslogServerCACert.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproveDuringMaintenance == null
                                ? 43
                                : this.isAutoApproveDuringMaintenance.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
