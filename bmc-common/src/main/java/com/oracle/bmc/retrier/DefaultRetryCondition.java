/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.retrier;

import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Multimap;
import com.oracle.bmc.model.BmcException;
import lombok.NonNull;

/**
 * Class that represents the conditions documented in
 * https://docs.cloud.oracle.com/iaas/Content/API/References/apierrors.htm for which the operation may be retried.
 */
public class DefaultRetryCondition implements RetryCondition {
    // List of retryable errors from https://docs.cloud.oracle.com/iaas/Content/API/References/apierrors.htm
    private static final Multimap<Integer, String> RETRYABLE_SERVICE_ERRORS =
            ImmutableSetMultimap.<Integer, String>builder()
                    .put(400, "RelatedResourceNotAuthorizedOrNotFound")
                    .put(401, "NotAuthenticated")
                    .put(404, "NotAuthorizedOrNotFound")
                    .put(409, "IncorrectState")
                    .put(409, "NotAuthorizedOrResourceAlreadyExists")
                    .put(429, "TooManyRequests")
                    .put(500, "InternalServerError")
                    .build();

    @Override
    public boolean shouldBeRetried(@NonNull final BmcException exception) {
        return exception.isClientSide()
                || exception.isTimeout()
                || exception.getStatusCode() >= 500
                || RETRYABLE_SERVICE_ERRORS.containsEntry(
                        exception.getStatusCode(), exception.getServiceCode());
    }
}
