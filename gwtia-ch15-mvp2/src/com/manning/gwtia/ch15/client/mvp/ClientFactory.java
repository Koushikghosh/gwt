package com.manning.gwtia.ch15.client.mvp;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.manning.gwtia.ch15.client.mvp.views.PhotoDetailsView;
import com.manning.gwtia.ch15.client.mvp.views.PhotoListTextView;
import com.manning.gwtia.ch15.client.mvp.views.PhotoListView;
import com.manning.gwtia.ch15.client.mvp.views.WelcomeView;
import com.manning.gwtia.ch15.shared.PhotoAlbumServiceAsync;

public interface ClientFactory {
	public EventBus getEventBus();
	PhotoAlbumServiceAsync getPhotoServices();
	PhotoDetailsView getPhotoView();
	PhotoListView getListView();
	WelcomeView getWelcomeView();
	PhotoListTextView getListTextView();
	public PlaceController getPlaceController();
}
