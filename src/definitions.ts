export interface AndroidFullViewPlugin {
  /**
   * Returns top offset of the status bar
   */
  top(): Promise<TopBottomReturn>;

  /**
   * Returns bottom offset of the status bar
   */
  bottom(): Promise<TopBottomReturn>;
}

export interface TopBottomReturn {
  value: number;
}
