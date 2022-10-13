import { registerPlugin } from '@capacitor/core';

import type { AndroidFullViewPlugin } from './definitions';

const AndroidFullView = registerPlugin<AndroidFullViewPlugin>('AndroidFullView', {
  web: () => import('./web').then(m => new m.AndroidFullViewWeb()),
});

export * from './definitions';
export { AndroidFullView };
