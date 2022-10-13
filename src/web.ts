import { WebPlugin } from '@capacitor/core';

import type { AndroidFullViewPlugin, TopBottomReturn } from './definitions';

export class AndroidFullViewWeb extends WebPlugin implements AndroidFullViewPlugin {
  async top(): Promise<TopBottomReturn> {
    return { value: 0 };
  }

  async bottom(): Promise<TopBottomReturn> {
    return { value: 0 };
  }
}
