// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Request Builder.
 */
public interface IBaseDriveItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IDriveItemRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IDriveItemRequest buildRequest(final java.util.List<Option> requestOptions);

    IDriveItemCollectionRequestBuilder getChildren();

    IDriveItemRequestBuilder getChildren(final String id);

    /**
     * Gets the request builder for ListItem.
     */
    IListItemRequestBuilder getListItem();

    IPermissionCollectionRequestBuilder getPermissions();

    IPermissionRequestBuilder getPermissions(final String id);

    IThumbnailSetCollectionRequestBuilder getThumbnails();

    IThumbnailSetRequestBuilder getThumbnails(final String id);

    /**
     * Gets the request builder for Workbook.
     */
    IWorkbookRequestBuilder getWorkbook();

    IDriveItemStreamRequestBuilder getContent();
    IDriveItemCopyRequestBuilder getCopy(final String name, final ItemReference parentReference);
    IDriveItemCreateLinkRequestBuilder getCreateLink(final String type, final String scope);
    IDriveItemCreateUploadSessionRequestBuilder getCreateUploadSession(final DriveItemUploadableProperties item);

    IDriveItemInviteCollectionRequestBuilder getInvite(final Boolean requireSignIn, final java.util.List<String> roles, final Boolean sendInvitation, final String message, final java.util.List<DriveRecipient> recipients);

    IDriveItemDeltaCollectionRequestBuilder getDelta(final String token);

    IDriveItemDeltaCollectionRequestBuilder getDelta();

    IDriveItemSearchCollectionRequestBuilder getSearch(final String q);

}