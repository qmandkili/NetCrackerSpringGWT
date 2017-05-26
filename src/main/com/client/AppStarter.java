package com.hellogwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AppStarter implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Label greetingLabel = new Label("Hello, GWT!");
        VerticalPanel verticalPanel = new VerticalPanel();
	    Button sendButton = new Button("Send");
	    verticalPanel.add(nameTextBox);
	    verticalPanel.add(greetingLabel);
	    verticalPanel.add(sendButton);
	    
		RootPanel.get("mainContainer").add(verticalPanel);
    }
}