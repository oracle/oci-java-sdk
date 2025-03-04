/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.requests;

import com.oracle.bmc.filestorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteReplicationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteReplicationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class DeleteReplicationRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * replication.
     */
    private String replicationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * replication.
     */
    public String getReplicationId() {
        return replicationId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * You can choose a mode for deleting the replication resource. - {@code
     * FINISH_CYCLE_IF_CAPTURING_OR_APPLYING} Before deleting, complete the current delta cycle. If
     * cycle is idle, delete immediately. Safest option. - {@code ONE_MORE_CYCLE} Before deleting,
     * complete the current delta cycle, and initiate one more cycle. If cycle is idle, initiate one
     * more cycle. Use for lossless failover. - {@code FINISH_CYCLE_IF_APPLYING} Before deleting,
     * finish applying. If cycle is idle or capturing, delete immediately. Fastest option.
     */
    private DeleteMode deleteMode;

    /**
     * You can choose a mode for deleting the replication resource. - {@code
     * FINISH_CYCLE_IF_CAPTURING_OR_APPLYING} Before deleting, complete the current delta cycle. If
     * cycle is idle, delete immediately. Safest option. - {@code ONE_MORE_CYCLE} Before deleting,
     * complete the current delta cycle, and initiate one more cycle. If cycle is idle, initiate one
     * more cycle. Use for lossless failover. - {@code FINISH_CYCLE_IF_APPLYING} Before deleting,
     * finish applying. If cycle is idle or capturing, delete immediately. Fastest option.
     */
    public enum DeleteMode implements com.oracle.bmc.http.internal.BmcEnum {
        FinishCycleIfCapturingOrApplying("FINISH_CYCLE_IF_CAPTURING_OR_APPLYING"),
        OneMoreCycle("ONE_MORE_CYCLE"),
        FinishCycleIfApplying("FINISH_CYCLE_IF_APPLYING"),
        ;

        private final String value;
        private static java.util.Map<String, DeleteMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DeleteMode v : DeleteMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        DeleteMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeleteMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DeleteMode: " + key);
        }
    };

    /**
     * You can choose a mode for deleting the replication resource. - {@code
     * FINISH_CYCLE_IF_CAPTURING_OR_APPLYING} Before deleting, complete the current delta cycle. If
     * cycle is idle, delete immediately. Safest option. - {@code ONE_MORE_CYCLE} Before deleting,
     * complete the current delta cycle, and initiate one more cycle. If cycle is idle, initiate one
     * more cycle. Use for lossless failover. - {@code FINISH_CYCLE_IF_APPLYING} Before deleting,
     * finish applying. If cycle is idle or capturing, delete immediately. Fastest option.
     */
    public DeleteMode getDeleteMode() {
        return deleteMode;
    }
    /** Whether to override locks (if any exist). */
    private Boolean isLockOverride;

    /** Whether to override locks (if any exist). */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteReplicationRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * replication.
         */
        private String replicationId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * replication.
         *
         * @param replicationId the value to set
         * @return this builder instance
         */
        public Builder replicationId(String replicationId) {
            this.replicationId = replicationId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * You can choose a mode for deleting the replication resource. - {@code
         * FINISH_CYCLE_IF_CAPTURING_OR_APPLYING} Before deleting, complete the current delta cycle.
         * If cycle is idle, delete immediately. Safest option. - {@code ONE_MORE_CYCLE} Before
         * deleting, complete the current delta cycle, and initiate one more cycle. If cycle is
         * idle, initiate one more cycle. Use for lossless failover. - {@code
         * FINISH_CYCLE_IF_APPLYING} Before deleting, finish applying. If cycle is idle or
         * capturing, delete immediately. Fastest option.
         */
        private DeleteMode deleteMode = null;

        /**
         * You can choose a mode for deleting the replication resource. - {@code
         * FINISH_CYCLE_IF_CAPTURING_OR_APPLYING} Before deleting, complete the current delta cycle.
         * If cycle is idle, delete immediately. Safest option. - {@code ONE_MORE_CYCLE} Before
         * deleting, complete the current delta cycle, and initiate one more cycle. If cycle is
         * idle, initiate one more cycle. Use for lossless failover. - {@code
         * FINISH_CYCLE_IF_APPLYING} Before deleting, finish applying. If cycle is idle or
         * capturing, delete immediately. Fastest option.
         *
         * @param deleteMode the value to set
         * @return this builder instance
         */
        public Builder deleteMode(DeleteMode deleteMode) {
            this.deleteMode = deleteMode;
            return this;
        }

        /** Whether to override locks (if any exist). */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         *
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(DeleteReplicationRequest o) {
            replicationId(o.getReplicationId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            deleteMode(o.getDeleteMode());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteReplicationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteReplicationRequest
         */
        public DeleteReplicationRequest build() {
            DeleteReplicationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteReplicationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteReplicationRequest
         */
        public DeleteReplicationRequest buildWithoutInvocationCallback() {
            DeleteReplicationRequest request = new DeleteReplicationRequest();
            request.replicationId = replicationId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.deleteMode = deleteMode;
            request.isLockOverride = isLockOverride;
            return request;
            // new DeleteReplicationRequest(replicationId, ifMatch, opcRequestId, deleteMode,
            // isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .replicationId(replicationId)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .deleteMode(deleteMode)
                .isLockOverride(isLockOverride);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",replicationId=").append(String.valueOf(this.replicationId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",deleteMode=").append(String.valueOf(this.deleteMode));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteReplicationRequest)) {
            return false;
        }

        DeleteReplicationRequest other = (DeleteReplicationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.replicationId, other.replicationId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.deleteMode, other.deleteMode)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.replicationId == null ? 43 : this.replicationId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.deleteMode == null ? 43 : this.deleteMode.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
