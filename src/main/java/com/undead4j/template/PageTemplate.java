package com.undead4j.template;

import static com.undead4j.template.Live.*;

public interface PageTemplate{
  public LiveTemplate render(
      PageTitleConfig pageTitleConfig,
      String csrfToken,
      LiveTemplate content
  );

  public default LiveTemplate liveTitle(PageTitleConfig pageTitleConfig) {
    return HTML."""
        <title
          \{when(pageTitleConfig.prefix != null, HTML." data-prefix='\{pageTitleConfig.prefix}'", EMPTY)}
          \{when(pageTitleConfig.suffix != null, HTML." data-suffix='\{pageTitleConfig.suffix}'", EMPTY)}
        >
          \{pageTitleConfig.title}
        </title>
    """;
  }
}